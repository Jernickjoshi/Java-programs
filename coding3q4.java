import java.util.Scanner;
class coding3q4{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your salary:");
        int sal = scan.nextInt();
        System.out.print("enter your age:");
        int age = scan.nextInt();
        if(sal >= 20000 || age <= 25)
        {
            System.out.println("eligible for loan");
            System.out.print("enter the loan amount:");
            int loan = scan.nextInt();
            if(loan <= 50000)
            {
                System.out.print("you are eligible for loan");
            }
            else
            {
                System.out.print("the maximum loan amount is 50000");
            }
        }
        else
        {
            System.out.println("not eligible");
        }


    }
}