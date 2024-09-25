import java.util.Scanner;
class coding3q2{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = a + b + c + d + e;
        int g = f/5;
        if(g < 35)
        {
            System.out.print("additional class required");
        }
        else
        {
            System.out.print("good to go");
        }
    }
}