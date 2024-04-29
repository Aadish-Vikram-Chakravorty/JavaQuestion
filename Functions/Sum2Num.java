import java.util.Scanner;

public class Sum2Num {
    public static int calculateSum(int a, int b){
        int c = a+b;
        System.out.println(c);
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = calculateSum(a, b);
    }
}
