import java.util.*;
public class J01006 {
  public static int fibo(int n){
    if (n <= 1) return n;
    return fibo(n - 1) + fibo(n - 2);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      System.out.println(fibo(n));
    }
  }
}
