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
        for(int i=a;i<=b;i=i+1)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i);
            }
        }
    }
}