import java.util.Scanner;

class multiplicationTable {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.println("Welcome to Table Generator: ");

         System.out.print("Enter the number: ");

         int num = input.nextInt();

         printMultiplicationTable(num);

         }

         public static void printMultiplicationTable (int num) {
             for (int i = 1; i <= 10; i++) {
                 System.out.println(num + "X" + i + "=" + (num * i));


             }

         }
}
