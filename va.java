import java.util.Scanner;
class va{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String USA = scan.nextLine();
        if(USA.equals("dead"))
        {
            System.out.print("Megana is dead");
        }
        else
        {
            System.out.print("Surya will marry megana");
        }
    }
}