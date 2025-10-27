import java.util.Scanner;

public class J02020 {
    static int n, k, count = 0;
    static int[] a = new int[20];

    static void print() {
        for (int i = 1; i <= k; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void Try(int i) {
        for (int j = a[i - 1] + 1; j <= n - k + i; j++) {
            a[i] = j;
            if (i == k) {
                print();
                count++;
            } else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a[0] = 0;
        Try(1);
        System.out.println("Tong cong co " + count + " to hop");
    }
}
