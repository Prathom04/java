import java.util.*;
public class measurement_of_temparature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a degree in Farenheit:");
        float Farenheit = sc.nextFloat();
        float Celsius = ((Farenheit -32)*5)/9;
        System.out.println(+Farenheit+ " degree Farenheit is equal to " +Celsius+" in Celsius.");
        sc.close();
    }
}
