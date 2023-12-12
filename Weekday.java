import java.util.Scanner;
public class Weekday
{
   public static void main(String args[])
     {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        int rem = num%7;
        if(rem == 0)
         {
            System.out.print("\n Its SUNDAY");
          }
        else if(rem == 1)
         { 
             System.out.print("\n Its MONDAY");
          }
         else if(rem == 2)
         { 
             System.out.print("\n Its TUESDAY");
          }
         else if(rem == 3)
         { 
             System.out.print("\n Its WEDNESDAY");
          } 
         else if(rem == 4)
         { 
             System.out.print("\n Its THURSDAY");
          }
         else if(rem == 5)
         { 
             System.out.print("\n Its FRIDAY");
          }
         else if(rem == 6)
         { 
             System.out.print("\n Its SATURDAY");
          }
     }
}