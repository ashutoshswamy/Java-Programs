package Assignment; //ignore this

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = scan.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("This is a Leap Year");
        } else if(year % 100 == 0){
            System.out.println("This is not a Leap Year");
        } else if(year % 400 == 0){
            System.out.println("This is a Leap Year");
        } else{
            System.out.println("This is not a Leap Year");
        }
    }
}
