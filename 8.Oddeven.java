import java.util.Scanner;

 class Oddeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's check Even or odd number!!!");
        System.out.print("Enter the number greater than zero: ");
        int num = input.nextInt();

        if(num%2 == 0){
            System.out.println(num+" is a even number");
        }else{
            System.out.println(num+" is a odd number");
        }
    }
}
