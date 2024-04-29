import java.util.Scanner;

public class Table {
    public static int printTable(int n){
        for(int i = 1; i <= 10; i++){
            int t = n*i;
            System.out.println(t);
        }
        return n; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print it's table: ");
        int n = sc.nextInt();
        int t = printTable(n);
    }
}
