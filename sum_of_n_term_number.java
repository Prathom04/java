import java.util.*;
public class sum_of_n_term_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n terms:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
                sum += i;
            }
            System.out.println("Sum of the numbers untill " +n+ " is:" +sum);
        sc.close();
    }
}
