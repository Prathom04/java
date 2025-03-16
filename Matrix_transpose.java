public class Matrix_transpose {
        public static void main(String[] args) {
            // Declare and initialize a 2D array (matrix)
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            // Find the transpose of the matrix
            int[][] transpose = new int[matrix[0].length][matrix.length];
    
            // Loop through each element of the original matrix
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    transpose[j][i] = matrix[i][j];  // Assign the transpose element
                }
            }
    
            // Print the original matrix
            System.out.println("Original Matrix:");
            printMatrix(matrix);
    
            // Print the transposed matrix
            System.out.println("\nTransposed Matrix:");
            printMatrix(transpose);
        }
    
        // Helper function to print a matrix
        public static void printMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();  // Move to the next line after each row
            }
        }
    }