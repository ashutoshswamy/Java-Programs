import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber, secondNumber;
        System.out.print("Please enter the first number: ");
        firstNumber= scan.nextInt();
        System.out.print("Please enter the second number: ");
        secondNumber= scan.nextInt();
        System.out.println(firstNumber + secondNumber);
    }
}
