import java.util.Random;
import java.util.Scanner;
/*
1. Generate a random number within a specified range, such as 1 to 100.

2. Prompt the user to enter their guess for the generated number.

3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.

4. Repeat steps 2 and 3 until the user guesses the correct number.

You can incorporate additional details as follows:

5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won.
 */
public class NumberGame
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        char c='y';
        while(c=='y')
        {
            System.out.println("Enter start and end of Range for Number Game :");
            int start=sc.nextInt();
            int end=sc.nextInt();
            Random rd= new Random();
            int randomNum=rd.nextInt((end-start)+start);
            System.out.println("enter number for how many times you want to guess the number :");
            int guess=sc.nextInt();
            for(int i=1;i<=guess;i++)
            {
                System.out.println("enter your guess number "+i+" is ");
                int guessNum=sc.nextInt();
                if(guessNum==randomNum)
                {
                    System.out.println("Guess number is correct");
                    if(i==1)
                    {
                        System.out.println("Your score for this round is 100%");
                    }
                    else if(i>(guess/2))
                    {
                        System.out.println("Your score for this round is below than 50%");
                    }
                    else
                    {
                        System.out.println("Your score for this round is more than 50%");
                    }
                    break;
                }
                else if(guessNum>randomNum)
                {
                    System.out.println("Guess number is too high");
                }
                else
                {
                    System.out.println("Guess number is too low");
                }

            }
            System.out.println("Do you want to play again : if yes then press y if no then press n ");
            c=sc.next().charAt(0);
        }
    }
}
