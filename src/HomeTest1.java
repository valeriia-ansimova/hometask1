import java.util.Scanner;

public class HomeTest1 {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Valeriia");

        int a = 74;
        int b = 36;
        int c = a + b;
        System.out.println("74 + 36 = " +c);

        a = 50;
        b = 3;
        c = a/b;
        System.out.println(c);

        int d;
        a = -5;
        b = 8;
        c = 6;
        d = a + b * c;
        System.out.println(d);

        a = 55;
        b = 9;
        c = 9;
        d = (a + b) % c;
        System.out.println(d);

        int e;
        a = 20;
        b =-3;
        c = 5;
        d = 8;
        e = a + b * c / d;

        System.out.println(e);

        a = 5;
        b = 15;
        c = 3;
        d = 2;
        e = 8;
        int f = 3;
        int g = a + b / c * d - e % f;
        System.out.println(g);

        //5
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = sc.nextInt();
        System.out.println("Input second number:  ");
        int num2 = sc.nextInt();
        System.out.println("Result 25 x 5 is " + (num1*num2));

        //6
        double o = 25.5;
        double p = 3.5;
        double r = 3.5;
        double s = 3.5;
        double t = 40.5;
        double q = 4.5;
        double res = (o * p - r * s) / (t - q);
        System.out.println("Result is " + res);
        System.out.println("Result is " +  (float) +res);

        //8
        double radius = 7.5;
        double area = Math.PI * ( radius * radius);
        System.out.println("Area is = " + area);
        double perimeter = Math.PI * 2 * radius;
        System.out.println("Perimetr is " + perimeter);

        //9
        System.out.println("Input first number: ");
        int num3 = sc.nextInt();
        System.out.println("Input second number:  ");
        int num4 = sc.nextInt();
        System.out.println("Input third number:  ");
        int num5 = sc.nextInt();
        System.out.println("Input fourth number:  ");
        int num6 = sc.nextInt();
        System.out.println("Enter fifth number:  ");
        int num7 = sc.nextInt();
        System.out.println("Average of the numbers is: " + ((num3 + num4 + num5 + num6 + num7)/5));
    }

}
