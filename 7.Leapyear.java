import java.util.Scanner;

class Leapyear {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Let's check a leap year!!!");
         System.out.print("Enter the year: ");

         int year = input.nextInt();

         if(year%4==0 && year%100!=0){
             System.out.println(year+ " is a leap year");
         }else if(year%100 == 0 && year%400==0){
             System.out.println(year+ " is a leap year");
         }else{
             System.out.println(year+" is not a leap year");
         }

     }
}
