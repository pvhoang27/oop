import java.util.*;
public class J02022 {
  static int n;
  static int[] a = new int[20];
  static boolean[] used = new boolean[20];

  static void in() {
    for (int i = 1; i <= n; i++) System.out.print(a[i]);
    System.out.println();
  }

  static void Try(int i){
    for(int j = 1 ; j <= n; j++){
      if(used[j] == false){
        if (i > 1 && Math.abs(a[i - 1] - j) == 1) continue;
        a[i] = j;
        used[j] = true;

        if(i == n) in();
        else Try(i + 1);

        used[j] = false;

      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t --> 0){
      n = sc.nextInt();
      Try(1);
      System.out.println();

    }
  }
}
