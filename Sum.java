import java.util.Scanner;

public class Sum{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number : ");
        int c = sc.nextInt();

        int sum = 0;

        sum += Math.min(a, Math.min(b, c));
        sum += Math.max(a, Math.max(b, c));
        
        System.out.println("Sum is " + sum);
        return;
    }
}