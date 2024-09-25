import java.util.Scanner;
class coding3q2{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        if(a.equals("Red"))
        {
            System.out.print("Stop");
        }
        else if(a.equals("Yellow"))
        {
            System.out.print("Get ready");
        }
        else if(a.equals("Green"))
        {
            System.out.print("go");
        }
    }
}