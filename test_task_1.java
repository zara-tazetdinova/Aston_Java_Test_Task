public class TestTask1 {
    public static void main(String args[]) {
        math(7, 7);
    }
    static void compare(int a,int b) {
        if (a>b){
            System.out.println("a > b");
        }
        else if(a==b){
            System.out.println("a = b");
        }
        else{
            System.out.println("a < b");
        }
    }
    static void math(int a,int b) {
        int add = a+b;
        int substract = a-b;
        int multiply = a*b;
        System.out.printf("Числа: %d, %d.%n", a,b);
        System.out.printf("Сумма чисел: %d.%n", add);
        System.out.printf("Разность чисел: %d.%n", substract);
        System.out.printf("Произведение чисел: %d.%n", multiply);
        if(b!=0){
            int divide = a/b;
            System.out.printf("Частное чисел: %d.%n", divide);
        }
        else{
            System.out.println("Частного нет. На 0 делить нельзя.");
        }
    }
}
