import java.util.Scanner;

public class HomeTask1 {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer a");
        a = sc.nextInt();
        System.out.println("Input integer b");
        b = sc.nextInt();
        System.out.println("Result a + b = " +(a+b));
        System.out.println("Result a - b = " +(a-b));
        System.out.println("Result a * b = " +(a*b));
        System.out.println("Result a/b = "+(a/b));
    }
}
