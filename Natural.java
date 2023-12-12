import java.util.Scanner;
public class Natural
{
    public static void main(String args[])
      {
           System.out.println("Enter a nummber: ");
           Scanner reader = new Scanner(System.in);
           int number=reader.nextInt();
           System.out.println("first " + number + " natural numbers are: ");
           for(int i=1;i<=number;i++)
             {
                System.out.print(i);
              }
       }
}