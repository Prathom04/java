public class Sum_of_all_element {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Variable to store the sum of elements
        int sum = 0;
        
        // Iterate through each row
        for (int i = 0; i < array.length; i++) {
            // Iterate through each column in the current row
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];  // Add the element to sum
            }
        }
        
        // Print the sum of all elements
        System.out.println("Sum of all elements in the 2D array: " + sum);
    }
}