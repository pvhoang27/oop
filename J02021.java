import java.util.Scanner;

 class J02021 {
    static int n, k, count = 0;
    static int[] a = new int[20];

    static void print() {
        for (int i = 1; i <= k; i++) {
            System.out.print(a[i] );
        }
        System.out.print(" ");
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
        System.out.print("\n");
        System.out.print("Tong cong co " + count + " to hop");
    }
}
