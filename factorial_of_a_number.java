import java.util.*;
public class factorial_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of which you want to get factorial:");
        int n = sc.nextInt();
        int p = 1;
        for(int i = 1; i <= n; i++){
                p *= i;
            }
            System.out.println("The factorial of the " +n+ " is: " +p);
        sc.close();
    }
}
