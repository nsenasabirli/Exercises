import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int number1;
        int number2;
        int number3;
        System.out.println("Enter the first number: ");
        number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        number2 = input.nextInt();
        System.out.println("Enter the third number: ");
        number3 = input.nextInt();

        System.out.println("The product of three numbers is: " + (number1 * number2 * number3));
    }

}
