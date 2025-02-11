import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите номер месяца (1-12) >> ");
            int monthIndex = scanner.nextInt() - 1;

            if (monthIndex < 0 || monthIndex >= 12) {
                throw new ArrayIndexOutOfBoundsException();
            }

            if (monthIndex == 1) {
                System.out.print("Введите год >> ");
                int year = scanner.nextInt();
                if (isLeapYear(year)) {
                    System.out.printf("Месяц: %s, Дней: %d (високосный год)\n", months[monthIndex], 29);
                } else {
                    System.out.printf("Месяц: %s, Дней: %d\n", months[monthIndex], dom[monthIndex]);
                }
            } else {
                System.out.printf("Месяц: %s, Дней: %d\n", months[monthIndex], dom[monthIndex]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число. Введите значение от 1 до 12.");
        } catch (InputMismatchException e) {
            System.out.println("Пожалуйста, введите целое число.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
