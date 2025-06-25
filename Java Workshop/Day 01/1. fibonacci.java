package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int a = 0, b = 1, fib = 0, n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        n = sc.nextInt();

        if (n == 0)
            fib = 0;
        else if (n == 1)
            fib = 1;
        else {
            for (int i = 2; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
        }

        System.out.println("Fibonacci of " + n + " is " + fib + ".");
        sc.close();
    }
}

