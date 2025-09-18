import java.util.*;
public class J02005 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int [] a = new int[n], b= new int[m],fA = new int[1005], fB= new int[1005];
    for(int i =  0 ; i < n; i++){
      a[i] = sc.nextInt();
      fA[a[i]] = 1;
    }
    for(int i =  0 ; i < m; i++){
      b[i] = sc.nextInt();
      fB[b[i]] = 1;
    }
    for(int i = 0 ; i < 1005; i++){
      if(fA[i] == 1 && fB[i] == 1){
        System.out.print(i + " ");
      }
    }

  }
}
