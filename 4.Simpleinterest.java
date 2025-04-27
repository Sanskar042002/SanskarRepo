import java.util.Scanner;

class Simpleinterest {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Simple interest Calculator");
         System.out.print("Enter Principle amount : ");
         int P = input.nextInt();

         System.out.print("Enter time period of loan in years: ");
         int T = input.nextInt();

         System.out.print("Enter rate of interest: ");
         double R = input.nextDouble();

         double Simple_interest = (P*R*T)/100;

         System.out.println("Simple interest is: " +Simple_interest);
     }
}
