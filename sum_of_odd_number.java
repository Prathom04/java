import java.util.*;
public class sum_of_odd_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n terms:");
        int n = sc.nextInt();
        int sum = 0;
        if( n % 2 != 0){
            for(int i = 1; i <= n; i+=2){
                sum += Math.pow(i, 2);
            }
            System.out.println("Sum of the square of odd numbers untill " +n+ " is:" +sum);
        }
        else 
        System.out.println(+n+" is not an odd number.");
        sc.close();
    }
}
