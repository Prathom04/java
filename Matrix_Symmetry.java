import java.util.*;
public class Matrix_Symmetry {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Taking input for the matrix dimensions
            System.out.print("Enter the number of rows and columns of the matrix: ");
            int rows = sc.nextInt();
            int cols = sc.nextInt();
    
            // A symmetric matrix must have the same number of rows and columns (square matrix)
            if (rows != cols) {
                System.out.println("Matrix is not symmetric because it is not a square matrix.");
                return;
            }
    
            // Declaring the matrix
            int[][] matrix = new int[rows][cols];
    
            // Taking input for the matrix
            System.out.println("Enter elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
    
            // Checking if the matrix is symmetric
            boolean isSymmetric = true;
            for (int i = 0; i < rows; i++) {
                for (int j = i + 1; j < cols; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        isSymmetric = false;
                        break;
                    }
                }
                if (!isSymmetric) {
                    break;
                }
            }
    
            // Output the result
            if (isSymmetric) {
                System.out.println("The matrix is symmetric.");
            } else {
                System.out.println("The matrix is not symmetric.");
            }
    
            sc.close();
        }
    }