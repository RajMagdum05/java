import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // For input
        System.out.print("Enter n: ");
        int n = sc.nextInt();  // Read input

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Print stars with a space
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            // New line after each row
            System.out.println();
        }

        sc.close();  // Close the scanner
    }
}
