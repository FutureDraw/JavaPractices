import java.io.*;
import java.net.*;

public class Main {
    private static final int PORT = 10;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("HTTP Server запущен на порту " + PORT);
            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    handleClient(clientSocket);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка запуска сервера: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(), "UTF-8"));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream(), "UTF-8"));

        String line = in.readLine();
        if (line == null) return;

        String[] requestParts = line.split(" ");
        String method = requestParts[0];
        String path = requestParts[1];

        if (method.equals("GET") && path.startsWith("/calculate")) {
            handleCalculate(path, out);
        } else {
            handleNotFound(out);
        }

        out.flush();
    }

    private static void handleCalculate(String path, PrintWriter out) {
        try {
            String query = path.split("\\?")[1];
            String[] params = query.split("&");
            int a = 0, b = 0;
            String op = null;

            for (String param : params) {
                String[] keyValue = param.split("=");
                if (keyValue[0].equals("a")) {
                    a = Integer.parseInt(keyValue[1]);
                } else if (keyValue[0].equals("b")) {
                    b = Integer.parseInt(keyValue[1]);
                } else if (keyValue[0].equals("op")) {
                    op = keyValue[1];
                }
            }

            int result = 0;
            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b == 0) {
                        sendHttpResponse(out, 400, "<html><body><h1>Ошибка: Деление на 0</h1></body></html>");
                        return;
                    }
                    result = a / b;
                    break;
                default:
                    sendHttpResponse(out, 400, "<html><body><h1>Ошибка: Неверная операция</h1></body></html>");
                    return;
            }

            String response = "<html><body><h1>Авдеев Александр Юрьевич 22И0121</h1><h1>Результат: " + result + "</h1></body></html>";
            sendHttpResponse(out, 200, response);

        } catch (Exception e) {
            sendHttpResponse(out, 400, "<html><body><h1>Ошибка: Неверный запрос</h1></body></html>");
        }
    }

    private static void handleNotFound(PrintWriter out) {
        sendHttpResponse(out, 404, "<html><body><h1>404 Not Found</h1></body></html>");
    }

    private static void sendHttpResponse(PrintWriter out, int statusCode, String body) {
        try {
            byte[] bodyBytes = body.getBytes("UTF-8");
            out.println("HTTP/1.1 " + statusCode + " OK");
            out.println("Content-Type: text/html; charset=UTF-8");
            out.println("Content-Length: " + bodyBytes.length);
            out.println();
            out.print(body);
            out.flush();
        } catch (UnsupportedEncodingException e) {
            System.err.println("Ошибка кодировки: " + e.getMessage());
        }
    }
}
