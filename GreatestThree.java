import java.util.Scanner;
public class GreatestThree
{
	public static void main (String args[])
	{
		Scanner reader=new Scanner(System.in);
                System.out.println("Enter threee numbers");
                System.out.print("Enter first number: ");
                int a=reader.nextInt();
                System.out.print("Enter second number: ");
                int b=reader.nextInt();
                System.out.print("Enter third number: ");
                int c=reader.nextInt();
                if(a>b)
                  {
                     if(a>c)
                        {
                              System.out.println("the number " + a + " is greatest");
                         }
                     else
                        {
                              System.out.println("the number " + c + " is greatest");
                        }
                  }
               else
                  {
                     if(b>c)
                        {
                              System.out.println("the number " + b + " is greatest");
                         }
                     else
                        {
                              System.out.println("the number " + c + " is greatest");
                        }
                  }
           }
}