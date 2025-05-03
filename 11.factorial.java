import java.util.Scanner;

 class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to factorial calculator!!!");
        System.out.print("Enter the number: ");

        int num = input.nextInt();
        int fact = printfactorial(num);

        System.out.println("Factorial is: "+fact);

    }

    public static int printfactorial(int num){
        int factorial = 1;
        int i = 1;

        while(i<=num){
            factorial *= i;
            i++;
        }
        return factorial;

    }
}
