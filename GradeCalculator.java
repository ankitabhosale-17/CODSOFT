import java.util.Scanner;
/*
Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user
 */
public class GradeCalculator
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        char c='y';
        while(c=='y')
        {
            System.out.println("How many subjects do you have : ");
            int numOfSubject=sc.nextInt();
            int totalsum=0;
            for(int i=1;i<=numOfSubject;i++)
            {
                int marks =0;
                System.out.println("Enter marks of "+i+" subject out of 100 : ");
                marks=sc.nextInt();
                totalsum=totalsum+marks;
            }
            System.out.println("Result is :");
            System.out.println("1. Total Marks :"+totalsum);
            int avg=Math.round(totalsum/numOfSubject);
            System.out.println("2. Average Percentage :"+avg);
            if(avg>=80)
            {
                System.out.print("3. Garde : A");
            }
            else if(avg>=60 && avg<80)
            {
                System.out.print("3. Garde : B");
            }
            else if(avg>=40 && avg<60)
            {
                System.out.print("3. Garde : C");
            }
            else
            {
                System.out.print("3. Garde : D");
            }
            System.out.println();
            System.out.println("Do you want to calculate grades for another student :  id yes then press y if no then press n :");
            c=sc.next().charAt(0);
        }
    }

}
