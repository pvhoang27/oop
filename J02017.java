// import java.util.*;
// public class J02017 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int[] a = new int[n];
//     for(int i = 0; i < n; i++){
//       a[i] = sc.nextInt();
//     }
//     for (int i = 0 ; i < n - 1; i++){
//       if((a[i] + a[i + 1]) % 2  == 0) n -= 2;
      
//     }
//     System.out.println(n);
//   }
// }


import java.util.*;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            // Nếu có phần tử kề trước đó (đỉnh stack) và tổng chẵn -> loại cặp
            if (!st.isEmpty() && ((st.peekLast() + x) % 2 == 0)) {
                st.pollLast(); // pop
            } else {
                st.addLast(x); // push
            }
        }

        System.out.println(st.size());
    }
}
