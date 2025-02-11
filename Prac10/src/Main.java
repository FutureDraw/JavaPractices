public class Main {
    public static void main(String[] args) {
        MyStackArray stackarray = new MyStackArray();
        stackarray.push("Первая строка");
        stackarray.push("Втооая строка");
        stackarray.push("Третья строка");
        stackarray.push("Четвертая строка");
        stackarray.push("Пятая строка");

        System.out.println("\nОригинальный " + stackarray);
        System.out.print("Строки в обратном порядке: ");
        while (!stackarray.isEmpty()) {
            System.out.print(stackarray.pop() + ", ");
        }

        MyStack stack = new MyStack();
        stack.push("Первый элемент");
        stack.push("Второй элемент");
        stack.push("Третий элемент");

        MyStack clonedStack = stack.clone();

        System.out.println("\n\nОригинальный " + stack);
        System.out.println("Клонированный " + clonedStack);
    }
}