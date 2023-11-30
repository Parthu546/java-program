import java.util.Scanner;
public class ReadInput
{
    public static void main(String args[])
      {
         System.out.println("enter the value: ");
         Scanner reader = new Scanner(System.in);
         int num=reader.nextInt();
         System.out.println("\nEntered number is "+num);
     }
}