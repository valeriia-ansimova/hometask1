import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        //1
        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius  ");
        radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " +area);

        //2
        System.out.println("What is your name?");
        String answerName = sc.next();
        System.out.println("Where are you live," +answerName );
        String myAddress = sc.next();
        System.out.println("My name is " + answerName + " I live " + myAddress);

        //3
        int country1 = sc.nextInt();
        int country2 = sc.nextInt();
        int country3 = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        System.out.println(country1 * t1);
        System.out.println(country2 * t2);
        System.out.println(country3 * t3);
        System.out.println(country1 * t1 + country2 * t2 + country3 * t3);




    }
}
