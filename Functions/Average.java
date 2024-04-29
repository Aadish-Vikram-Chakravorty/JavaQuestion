import java.util.Scanner;

public class Average {
    public static int printAve(int a, int b, int c) {
        int d = (a + b + c)/3;
        System.out.println("The Average of the three numbers is: " + d);
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = printAve(a, b, c);
    }
}
