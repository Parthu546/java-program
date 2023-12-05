import java.util.Scanner;
public class Areacircle
{
   public static void main(String args[])
     {
        Scanner reader = new Scanner(System.in);
        System.out.print("\n enter the radius of a circle: ");
        double radius = reader.nextDouble();
        double area = 3.14*radius*radius;
        System.out.println("\n Area of circle is "+area);
     }
}