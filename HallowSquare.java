import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if ( row==1 || col==1 || row==n || col==n )
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
