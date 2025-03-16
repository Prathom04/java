import java.util.*;
public class Boundary_element{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Taking input for the dimensions of the matrix
            System.out.print("Enter the number of rows and columns of the matrix: ");
            int rows = sc.nextInt();
            int cols = sc.nextInt();
    
            // Declaring the matrix
            int[][] matrix = new int[rows][cols];
    
            // Taking input for the matrix elements
            System.out.println("Enter elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
    
            // Printing the boundary elements of the matrix
            System.out.println("Boundary elements of the matrix are:");
            
            // Top row
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[0][j] + " ");
            }
    
            // Right column (excluding the top and bottom corners already printed)
            for (int i = 1; i < rows; i++) {
                System.out.print(matrix[i][cols - 1] + " ");
            }
    
            // Bottom row (if there are more than one row)
            if (rows > 1) {
                for (int j = cols - 2; j >= 0; j--) {
                    System.out.print(matrix[rows - 1][j] + " ");
                }
            }
    
            // Left column (excluding the top and bottom corners already printed)
            if (cols > 1) {
                for (int i = rows - 2; i > 0; i--) {
                    System.out.print(matrix[i][0] + " ");
                }
            }
    
            System.out.println(); // To move to the next line after printing boundary elements
    
            sc.close();
        }
    }