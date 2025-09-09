import java.util.*;
public class J01007 {
  public static boolean checkFibo(int n){
    int a = 0, b = 1;
    if (n == 0 || n == 1) return true;
    int c = a + b;
    while (c < n) {
      a = b;
      b = c;
      c = a + b;
    }
    return c == n;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      if (checkFibo(n)) System.out.println("YES");
      else System.out.println("NO");
    }
  }
}
