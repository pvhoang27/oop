import java.util.*;
public class J01009 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int sum = 0;
    int gt = 1;
    for(int i = 1; i <= n; i++) {
      gt *= i;
      sum += gt;
    }
    System.out.println(sum);
  }
}
