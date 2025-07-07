import java.util.Scanner;

class Credit
{
    private int accountNo;
    private int beginBal;
    private int totalCharges;
    private int totalCredits;
    private int creditLimit;

    public Credit(int accountNo, int beginBal, int totalCharges, int totalCredits, int creditLimit)
    {
        this.accountNo = accountNo;
        this.beginBal = beginBal;
        this.totalCharges = totalCharges;
        this.totalCredits = totalCredits;
        this.creditLimit = creditLimit;
    }

    public int newBal()
    {
        return beginBal+totalCharges-totalCredits;
    }
}

public class Main{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter account No.: ");
    int accountNo = sc.nextInt();

     System.out.println("Enter Balace in the beginning of the month: ");
    int beginBal = sc.nextInt();

    System.out.println("Enter Total Charges: ");
    int totalCharges = sc.nextInt();

    System.out.println("Enter Total Credits: ");
    int totalCredits = sc.nextInt();

    System.out.println("Enter Credit Limit: ");
    int creditLimit = sc.nextInt();

    Credit c = new Credit(accountNo, beginBal, totalCharges, totalCredits, creditLimit);

        try{
            if (c.newBal() > creditLimit) {
                throw new Exception("Credit Limit Exceeded");
            }
            System.out.println("New Balance: " + c.newBal());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Thank you for using Credit Checker");


}
}
