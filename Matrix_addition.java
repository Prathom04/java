import java.util.*;
public class Matrix_addition {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Taking input for the dimensions of the matrices
            System.out.print("Enter the number of rows and columns for the matrices: ");
            int rows = sc.nextInt();
            int cols = sc.nextInt();
    
            // Declaring the matrices
            int[][] matrix1 = new int[rows][cols];
            int[][] matrix2 = new int[rows][cols];
            int[][] result = new int[rows][cols];
    
            // Taking input for Matrix 1
            System.out.println("Enter elements of Matrix 1:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }
    
            // Taking input for Matrix 2
            System.out.println("Enter elements of Matrix 2:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }
    
            // Matrix addition
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
    
            // Printing the result matrix
            System.out.println("Resultant Matrix after addition:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
    
            sc.close();
        }
    }