import java.util.Scanner;

class program4{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double score = scan.nextDouble();
        scan.nextLine();
        String dept = scan.nextLine();
        System.out.println("My Name is " +name);
        System.out.println("My score is " + score/10 +"/10");
        System.out.print("My dept is " +dept);
    }
}