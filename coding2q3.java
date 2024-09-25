import java.util.Scanner;
class coding2q3{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a % 2 == 0)
        {
            System.out.print("the number is even");
        }
        else
        {
            System.out.print("the number is odd");
        }
    }
}