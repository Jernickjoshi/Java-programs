import java.util.Scanner;

class nad{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();
        String address = scan.nextLine();
        System.out.println("My Name is " +name);
        System.out.println("My Age is " +age);
        System.out.print("My address is " +address);
    }
}