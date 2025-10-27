import java.util.*;
public class J02034 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] a = new int[n];
    for (int i = 0 ; i < n; i++){
      a[i] = sc.nextInt();
    }
    int max = a[n -  1];
    boolean ok = true ;

    for (int i = 1 ; i <= max ; i++){
      boolean found = false ;
      for(int j = 0 ; j < n ;j++){
        if(a[j] == i){
          found = true; 
          break;
        }
      }
      if(!found){
        System.out.println(i); 
        ok = false;
      }
    }
    if(ok) System.out.println("Excellent!");
  }
}
