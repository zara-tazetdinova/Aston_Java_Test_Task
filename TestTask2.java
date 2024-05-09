import java.util.Scanner;

public class TestTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String phrase1 = input.nextLine();
        System.out.print("Введите вторую строку: ");
        String phrase2 = input.nextLine();
        input.close();
        compareStrings(phrase1, phrase2);
    }

    static void compareStrings(String phrase1, String phrase2) {
        if (phrase1.equals(phrase2)) {
            System.out.println("Строки идентичны.");
        } else {
            System.out.println("Строки неидентичны.");
        }
    }

}
