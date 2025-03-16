public class row_collum_sum {
        public static void main(String[] args) {
            // Declare and initialize a 2D array
            int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            // Calculate and print the sum of each row
            System.out.println("Sum of each row:");
            for (int i = 0; i < array.length; i++) {
                int rowSum = 0;  // Variable to store the sum of the current row
                for (int j = 0; j < array[i].length; j++) {
                    rowSum += array[i][j];  // Add element to rowSum
                }
                System.out.println("Row " + (i + 1) + " sum: " + rowSum);
            }
    
            // Calculate and print the sum of each column
            System.out.println("\nSum of each column:");
            for (int j = 0; j < array[0].length; j++) {
                int colSum = 0;  // Variable to store the sum of the current column
                for (int i = 0; i < array.length; i++) {
                    colSum += array[i][j];  // Add element to colSum
                }
                System.out.println("Column " + (j + 1) + " sum: " + colSum);
            }
        }
    }