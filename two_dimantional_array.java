public class two_dimantional_array {
        public static void main(String[] args) {
            // Declare a 2D array
            int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            
            // Iterate through each row
            for (int i = 0; i < array.length; i++) {
                // Iterate through each column in the current row
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                // Move to the next line after printing all columns of the current row
                System.out.println();
            }
        }
    }
