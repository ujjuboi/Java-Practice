package classes;
import java.util.Scanner;

class Userinput
{
    public static void main(String args[])
    {
        try{
            System.out.println("First is the Command Line input. From the two numbers: ");
            try
            {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                System.out.println("The sum of the numbers is "+ (a+b));
            }
            catch(Exception e)
            {
                double c = Double.parseDouble(args[0]);
                double d = Double.parseDouble(args[1]);
                System.out.println("The sum of the numbers is "+(c+d));
            }
        }
        catch(Exception e)
        {
            System.out.println("Next time you start the program, give command line input frist.");
        }
        finally{
            System.out.println("Second using scanner class: ");
            Scanner s = new Scanner(System.in);
            System.out.print("Enter two numbers: ");
            try{
                int a = s.nextInt();
                int b = s.nextInt();
                System.out.println("The sum of the two numbers is "+ (a+b));
            }
            catch(Exception e)
            {
                double c = s.nextDouble();
                double d = s.nextDouble();
                System.out.println("The sum of the two numbers is "+ (c+d));
            }
        }
    }
}