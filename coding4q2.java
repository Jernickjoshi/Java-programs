import java.util.Scanner;
class coding4q2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("begining of the sequence: ");
        int a = scan.nextInt();
        System.out.print("end of sequence: ");
        int b = scan.nextInt();
        int evencount = 0;
        for(int i=a;i<=b;i=i+1)
        {
            if(i % 2 == 0)
            {
                evencount = evencount + 1;
                System.out.println(i);
            }
            else
            {
                //oddcount = oddcount + 1;
                //System.out.println(i);
            }
        }
        System.out.println(evencount);
    }
}