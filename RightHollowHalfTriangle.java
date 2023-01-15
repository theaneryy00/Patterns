import java.util.Scanner;
// not yet finish
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = row; col <= n; col++) {                
                    System.out.print("  ");
            }
            for (int col = 1; col <=row ; col++) {
                if (col==row || col==n || row==n )
                System.out.print("* ");
            else
                System.out.print("");
        }
            
            System.out.println();
        }
    }
}
