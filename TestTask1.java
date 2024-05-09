import java.util.Scanner;

public class TestTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число a: ");
        while (!input.hasNextInt()) {
            System.out.println("Это не число, попробуйте снова!");
            System.out.print("Введите число a: ");
            input.next();
        }
        int a = input.nextInt();

        System.out.print("Введите число b: ");
        while (!input.hasNextInt()) {
            System.out.println("Это не число, попробуйте снова!");
            System.out.print("Введите число b: ");
            input.next();
        }
        int b = input.nextInt();

        input.close();

        compare(a, b);
        math(a, b);
    }

    private static void compare(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void math(int a, int b) {
        int add = a + b;
        int subtract = a - b;
        int multiply = a * b;
        System.out.printf("Сумма чисел: %d.%n", add);
        System.out.printf("Разность чисел: %d.%n", subtract);
        System.out.printf("Произведение чисел: %d.%n", multiply);
        if (b != 0) {
            int divide = a / b;
            System.out.println("Осторожно, деление целочисленное!");
            System.out.printf("Частное чисел: %d.%n", divide);
        } else {
            System.out.println("Частного нет. На 0 делить нельзя.");
        }
    }
}
