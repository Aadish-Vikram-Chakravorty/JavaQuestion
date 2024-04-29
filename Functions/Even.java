import java.util.Scanner;

public class Even {
    public static int checkEven(int n){
        if (n % 2 == 0){
            System.out.println("Number is Even" );
        }
        else if (n % 2 != 0){
            System.out.println("Number is Odd");
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int num = checkEven(n);
    }
}
