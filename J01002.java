import java.util.* ;
public class J01002 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- > 0 ){
      long n = sc.nextLong();          // dùng long
      long sum = n * (n + 1) / 2;      // tính bằng long để không tràn
      System.out.println(sum);
    }
  }
}
