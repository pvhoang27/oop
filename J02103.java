// import java.util.*;

// public class J02103 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         for (int test = 1; test <= t; test++) {
//             int n = sc.nextInt();
//             int m = sc.nextInt();
//             int[][] a = new int[n][m];
//             for (int i = 0; i < n; i++)
//                 for (int j = 0; j < m; j++)
//                     a[i][j] = sc.nextInt();
            
//             int[][] c = new int[n][n];
//             for (int i = 0; i < n; i++) {
//                 for (int j = 0; j < n; j++) {
//                     int sum = 0;
//                     for (int k = 0; k < m; k++)
//                         sum += a[i][k] * a[j][k];
//                     c[i][j] = sum;
//                 }
//             }
            
//             System.out.println("Test " + test + ":");
//             for (int i = 0; i < n; i++) {
//                 for (int j = 0; j < n; j++) {
//                     System.out.print(c[i][j]);
//                     if (j < n - 1) System.out.print(" ");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }


import java.util.*;
public class J02103 {
    static int[][] transpose(int[][] a, int n, int m) {
        int[][] t = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }
    static int[][] multiply(int[][] a, int[][] b, int n, int m, int p) {
        int[][] c = new int[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                int sum = 0;
                for (int k = 0; k < m; k++) {
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    a[i][j] = sc.nextInt();
            int [][] at = transpose(a, n, m);
            int [][] c = multiply(a, at, n, m, n);
            System.out.println("Test " + test + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(c[i][j]);
                    if (j < n - 1) System.out.print(" ");
                }
                System.out.println();
            }
        }
               
    }
}
