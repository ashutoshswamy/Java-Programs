package Assignment; //ignore this

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        int month;
        String monthName;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the month in numericals month: ");
        month = scan.nextInt();
        switch(month){
            case 1: monthName = "Jan";
            break;
            case 2: monthName = "Feb";
            break;
            case 3: monthName = "March";
            break;
            case 4: monthName = "April";
            break;
            case 5: monthName = "May";
            break;
            case 6: monthName = "June";
            break;
            case 7: monthName = "July";
            break;
            case 8: monthName = "August";
            break;
            case 9: monthName = "Sept";
            break;
            case 10: monthName = "Oct";
            break;
            case 11: monthName = "Nov";
            break;
            case 12: monthName = "Dec";
            break;
            default: monthName = "Invalid input";
            break;
        }
        System.out.println(monthName);
    }
}
