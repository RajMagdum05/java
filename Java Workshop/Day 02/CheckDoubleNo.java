import java.util.Scanner;

public class Double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter num2: ");
        double num2 = sc.nextDouble();

        if (num1 == (int)num1) {
            System.out.println("Num1 is integer");
            System.exit(1);
        }

        if (num2 == (int)num2) {
            System.out.println("Num2 is integer");
            System.exit(1);
        }

        System.out.println("Average of both double numbers is " + ((num1 + num2) / 2.0) + " .");

        sc.close();
    }
}

    
