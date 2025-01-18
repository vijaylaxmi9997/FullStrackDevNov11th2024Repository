package com.gentech.testDemos;

public class Demot3 {

    // 2x2 byte array
    static byte[][] matrix = {
            {1, 2},
            {3, 4}
    };

    // Static block for transposing the array
    static {
        // Transpose the matrix
        byte[][] transposedMatrix = new byte[2][2];  // Create a new 2x2 array to store the transposed matrix

        // Transpose operation: Swap rows and columns
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transposedMatrix[i][j] = matrix[j][i];  // Swap element at (i, j) with (j, i)
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print the transposed matrix
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Main method, class is loaded and static block is executed automatically
    }
}
