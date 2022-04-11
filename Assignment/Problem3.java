package Assignment; //ignore this

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        int n, i , j, k = 8;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of lines: ");
        n = input.nextInt();
        for(i = 0; i < n; i++){
            for(j = 0; j < k; j++){
                System.out.print("");
            }
            k = k - 2;
            for(j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
