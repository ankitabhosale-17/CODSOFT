import java.util.Scanner;

/*
1.Create a class to represent the ATM machine.
2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.
3. Implement methods for each option, such as withdraw(amount), deposit(amount), and checkBalance().
4. Create a class to represent the user's bank account, which stores the account balance.
5. Connect the ATM class with the user's bank account class to access and modify the account balance.
6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions.
 */

interface ATM
{
    void withdrawing(double amount,double bankBalance);
    void depositing(double amount,double bankBalance);
    void checkBalance(double bankBalance);
}
public class AtmInterface implements ATM
{
    public void withdrawing(double amount,double bankBalance)
    {
        System.out.println("Withdrawval Successfull of "+amount);
        bankBalance=bankBalance-amount;
        System.out.println("Remaining balance in your account is : "+bankBalance);
    }
    public void depositing(double amount,double bankBalance)
    {
        System.out.println("Deposit Successfull of "+amount);
        bankBalance=bankBalance+amount;
        System.out.println("Remaining balance in your account is : "+bankBalance);
    }
    public void checkBalance(double bankBalance)
    {

        System.out.println("Remaining balance in your account is : "+bankBalance);
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        double bankBalance=0;
        System.out.println("Enter the Bank Balance you have in your account : ");
        bankBalance=sc.nextInt();

        AtmInterface at=new AtmInterface();
        int i=0;
        int count=0;
        while(count!=1)
        {
            double amount=0;
            System.out.println("Enter the amount to be Withdraw/Deposit : ");
            amount=sc.nextInt();

            if(amount<=bankBalance)
            {
                System.out.println();
            }
            else
            {
                System.out.println("Enter the valid amount to be Withdraw/Deposit : ");
                amount=sc.nextInt();
            }
            System.out.println("Enter Number for 1. Withdraw 2. Deposit 3. check Balance 4. Exit");
            i=sc.nextInt();
            count++;
            switch(i)
            {
                case 1:
                    at.withdrawing(amount,bankBalance);
                    break;
                case 2:
                    at.depositing(amount,bankBalance);
                    break;
                case 3:
                    at.checkBalance(bankBalance);
                    break;
                default:
                    System.out.println("Enter Valid Number");
            }

        }

    }

}
