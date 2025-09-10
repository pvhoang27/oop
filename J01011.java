import java.util.Scanner;

public class J01011 {
    public static int ucln(int a, int b) {
        if (b == 0) {
            return a;
        }
        return ucln(b, a % b);
    }
    public static int bcnn(int a, int b) {
        return (a * b) / ucln(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print(bcnn(a, b));
            System.out.println(" " + ucln(a, b));
        }
    }
}