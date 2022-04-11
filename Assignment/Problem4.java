package Assignment;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        int rows;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of lines: ");
        rows = scan.nextInt();
        for(int i = rows; i >= 1; i++){
            for(int j = i; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }     
        for(int i = 2; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}