package rahul.api;

public class calculator {
    //public class Main{

    public static void main(String[] args) {
        int a = addition(9,3);
        int b = subtraction(20, 2);
        int c = multiplication(10,6);
        int d = division(8, 4);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public static int division(int num1, int num2){
        return num1 / num2;
    }
}



