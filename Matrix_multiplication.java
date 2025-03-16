import java.util.*;

public class Matrix_multiplication {
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Taking input for the dimensions of the matrices
            System.out.print("Enter the number of rows and columns for Matrix 1: ");
            int row1 = sc.nextInt();
            int col1 = sc.nextInt();
    
            System.out.print("Enter the number of rows and columns for Matrix 2: ");
            int row2 = sc.nextInt();
            int col2 = sc.nextInt();
    
            // If the number of columns in matrix 1 is not equal to the number of rows in matrix 2, multiplication is not possible.
            if (col1 != row2) {
                System.out.println("Matrix multiplication is not possible. The number of columns in Matrix 1 must be equal to the number of rows in Matrix 2.");
                return;
            }
    
            // Declaring the matrices
            int[][] matrix1 = new int[row1][col1];
            int[][] matrix2 = new int[row2][col2];
            int[][] result = new int[row1][col2];
    
            // Taking input for Matrix 1
            System.out.println("Enter elements of Matrix 1:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }
    
            // Taking input for Matrix 2
            System.out.println("Enter elements of Matrix 2:");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }
    
            // Matrix multiplication
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    result[i][j] = 0; // Initialize the result element
                    for (int k = 0; k < col1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
    
            // Printing the result matrix
            System.out.println("Resultant Matrix after multiplication:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
    
            sc.close();
        }
    }