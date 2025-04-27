import java.util.Scanner;

class FloatMultiplication {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter first float number: ");

         float first = input.nextFloat();

         System.out.print("Enter second float number: ");

         float second = input.nextFloat();

         double mul = first * second ;

         System.out.println("Multiplication of two float numbers is: " +mul);

     }
}
