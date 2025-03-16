import java.util.*;
public class Zigzag_traversal{
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

        // Zigzag traversal of the matrix
        System.out.println("Zigzag traversal of the matrix is:");

        // Traverse each column in a zigzag pattern
        for (int j = 0; j < cols; j++) {
            if (j % 2 == 0) {
                // Traverse downward (from top to bottom) for even-indexed columns
                for (int i = 0; i < rows; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // Traverse upward (from bottom to top) for odd-indexed columns
                for (int i = rows - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

        System.out.println(); // To move to the next line after traversal

        sc.close();
    }
}