import java.util.Scanner;

public class Prime {
    public static int checkPrime(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Number is not prime");
            } else if (n % i != 0) {
                System.out.println("Number is not prime");
            }
        }
        return n;
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int prime = checkPrime(n);
}
