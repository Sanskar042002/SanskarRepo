import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker ");
        System.out.print("Enter  the number: ");

        int num = input.nextInt();

        if(num>0){
            System.out.println("Given number is positive");
        }else if (num == 0){
            System.out.println("given number is zero");
        }else {
            System.out.println("Given number is negative");
        }
    }
}
