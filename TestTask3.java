public class TestTask3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        evenNumbers(arr);
    }

    private static void evenNumbers(int[] arr) {
        System.out.println("Четные числа массива:");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}