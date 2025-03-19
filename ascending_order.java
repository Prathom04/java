import java.util.Arrays;
import java.util.*;
public class ascending_order {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the number of elements you want to sort: ");
            int n = scanner.nextInt();
    
            int[] numbers = new int[n];
    
            System.out.println("Enter the numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }
    
            Arrays.sort(numbers); // Sort the array in ascending order
    
            System.out.println("Sorted numbers in ascending order:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println(); // Add a newline at the end.
    
            scanner.close();
        }
    }
