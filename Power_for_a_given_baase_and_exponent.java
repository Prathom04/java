import java.util.*;
public class Power_for_a_given_baase_and_exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Base:");
        double m = sc.nextDouble();
        System.out.print("Input exponent:");
        double n = sc.nextDouble();
        double p = Math.pow(m, n);
            System.out.println("Power of the " +m+ " is:" +p);
            sc.close();
}
}
