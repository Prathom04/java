import java.util.*;
public class Testing_leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a year:");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(+year+ " is the leap year.");
        }
        else 
        System.out.println(+year+ " is not the leap year.");
        sc.close();
    }
}
