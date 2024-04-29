import java.util.Scanner;

public class Multiply2Num {
    public static int Multiply(int a, int b) {
        int c = a * b;
        System.out.println("The product of the two numbers is: " + c);
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Multiply(a, b);
    }

}
