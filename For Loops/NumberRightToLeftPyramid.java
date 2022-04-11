import java.util.Scanner;

public class NumberPyramid2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of lines: ");
        int counter;
        counter = scan.nextInt();
        //outer loop
        for(int i = 1; i <= counter; i++){
            //inner loop
            for(int j = 1; j <= counter - i + 1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }    
}
