import java.util.Scanner;

class greatestnumber {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Let's check greatest number");
         System.out.print("Enter three numbers: ");

         int a = input.nextInt();
         int b = input.nextInt();
         int c = input.nextInt();

         if(a>b && a>c){
             System.out.println(a+ "is the greatest number");
         }else if(b>a && b>c){
             System.out.println(b+ " is te greatest number");
         }else{
             System.out.println(c+ " is the greatest number");
         }
     }
}
