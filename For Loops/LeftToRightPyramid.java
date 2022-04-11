import java.util.Scanner;

public class Pyramid1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter;
        System.out.print("Please enter the number of lines: ");
        counter = scan.nextInt();
        //outer loop
        for(int i = 1; i <= counter; i++){
            //inner loop
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
