public class largest_and_smallest_element_of_two_dimantional_array {
public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Initialize the largest and smallest elements to the first element of the array
        int largest = array[0][0];
        int smallest = array[0][0];
        
        // Iterate through each row
        for (int i = 0; i < array.length; i++) {
            // Iterate through each column in the current row
            for (int j = 0; j < array[i].length; j++) {
                // Update largest and smallest if necessary
                if (array[i][j] > largest) {
                    largest = array[i][j];
                }
                if (array[i][j] < smallest) {
                    smallest = array[i][j];
                }
            }
        }
        
        // Print the largest and smallest elements
        System.out.println("Largest element in the 2D array: " + largest);
        System.out.println("Smallest element in the 2D array: " + smallest);
    }
}