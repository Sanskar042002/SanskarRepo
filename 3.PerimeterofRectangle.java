import java.util.Scanner;

class PerimeterofRectangle {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("We are calculating perimetre of rectangle");
         System.out.println("Enter lengths of opposite sides of retangle!! ");
         System.out.print("Enter the length of first side: ");
         float side1= input.nextFloat();

         System.out.print("Enter the length of second side: ");

         float side2 = input.nextFloat();



         float POR  = 2*(side1 + side2);

         System.out.println("Perimetre of rectangle is: " +POR);
     }
}
