import java.util.*;
public class J01016 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int cnt = 0 ;
    for(int i = 0 ; i < n.length(); i++){
      char c = n.charAt(i);
      if(c == '4' || c == '7') cnt ++;
      // if(c == '7') cnt ++;
    }
    // System.out.println(cnt);
    if(cnt == 4 || cnt  == 7) System.out.println("YES");
    else System.out.println("NO");
  }
}
