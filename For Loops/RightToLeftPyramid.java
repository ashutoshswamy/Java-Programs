import java.util.Scanner;

public class Pyramid2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter;
        System.out.print("Please enter the number of lines: ");
        counter = scan.nextInt();
        //outer loop
        for(int i = counter; i >= 1; i--){
            //inner loop
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
