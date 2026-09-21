import java.util.Scanner;

public class Cal_3012_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        double a = sc.nextDouble();
        System.out.println("enter the second number");
        double b = sc.nextDouble();
        System.out.println(addMe(a,b));
        System.out.println(subMe(a,b));
        System.out.println(mulMe(a,b));
        System.out.println(divMe(a,b));
    }
    public static double addMe(double a, double b) {
        return a+b;
    }
    public static double subMe(double a, double b) {
        return a-b;
    }
    public static double mulMe(double a, double b) {
        return a*b;
    }
    public static double divMe(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}