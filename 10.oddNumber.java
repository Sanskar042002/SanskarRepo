import java.util.Scanner;

class oddNumber {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Finding odd number!!");
         System.out.print("Enter the number: ");

         int num = input.nextInt();
         int sum = printOddNumber(num);
         System.out.println("Odd number sum is: "+sum);
     }
     public static int printOddNumber(int num){
          int sum = 0;
          int i = 1;

          while(i<=num){
              sum = sum +i;
              i+=2;
          }
          return sum;
          }

     }

