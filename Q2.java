//  Sorting of 2D array in both the manner i.e. in ascending and descending order, 
//  by the means of switch case operation an option which order sort should be provided to user.
//   Instructions to follow
//    1. All the elements of array should be entered by user no pre filled values are acceptable.
//   2. Use of Inbuilt functions are restricted.

import java.io.*;
import java.util.Scanner;

public class Q2 {
    static int sortRowWise(int m[][], boolean asc) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                for (int k = 0; k < m[i].length - j - 1; k++) {
                    if (asc) {
                        if (m[i][k] > m[i][k + 1]) {

                            int temp = m[i][k];
                            m[i][k] = m[i][k + 1];
                            m[i][k + 1] = temp;
                        }
                    } else {
                        if (m[i][k] < m[i][k + 1]) {

                            int temp = m[i][k];
                            m[i][k] = m[i][k + 1];
                            m[i][k + 1] = temp;
                        }
                    }

                }
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }

        return 0;
    }

    // driver code
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m and n for the matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        System.out.println("Enter the elements of the matrix rowwise now");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("In which order you want to sort(a/d)");
        char c = sc.next().charAt(0);
        if (c != 'a' && c != 'd') {
            sc.close();
            throw new Exception("enter either a or d");
        }
        boolean isAsc = c == 'a' ? true : false;
        sortRowWise(mat, isAsc);
        sc.close();

    }
}
