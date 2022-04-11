import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.print("Please enter the first number: ");
        x = scan.nextInt();
        System.out.print("Please enter the second number: ");
        y = scan.nextInt();
        System.out.println(x + y);
    }
}
