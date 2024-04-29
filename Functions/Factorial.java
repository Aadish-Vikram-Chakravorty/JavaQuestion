import java.util.Scanner;

public class Factorial {
    public static int calFact(int n){
        int fact = 1;
        if (n > 0){
            for(int i = 1; i <= n; i++){
                fact = fact*i;
            }
            System.out.println("Factorial is: " +fact);
        }
        else if (n == 0){
            System.out.println("Factorial is: 1");;
        }
        else{
            System.out.println("Invalid input");
        }

        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int factorial = calFact(n);
    }
}
