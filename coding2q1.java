import java.util.Scanner;
class coding2q1{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a >= 7000)
        {
            System.out.print("scholarship available");
        }
        else
        {
            System.out.print("not eligible");
        }
    }

}