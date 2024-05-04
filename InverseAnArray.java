import java.io.*;
import java.util.*;

public class InverseAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
    // write your code here
    int[] inv = new int[a.length];
    for(int i = 0; i < a.length; i++){
        int v = a[i];
        inv[v] = i;
    }
    return inv;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    display(inv);
 }

}


// import java.util.*;

// public class InverseAnArray{
//     public static Scanner scn = new Scanner(System.in);

//     public static void input(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();
//         }
//     }

//     public static void display(int[] ans) {
//         int n = ans.length;
//         for (int i = 0; i < n; i++) {
//             System.out.println(ans[i] + " ");
//         }
//     }

//     public static void inverseAnArray(int[] arr) {
//         int n = arr.length;
//         int[] ans = new int [n];
//         for (int i = 0; i < n; i++) {
//             int idx = arr[i];
//             ans[idx] = i;

//         }
//         display(ans);
//   }

//     public static void main(String[] args) {
//         int n = scn.nextInt();
//         int[] arr = new int[n];

//         input(arr);
        
//         inverseAnArray(arr);
       

//     }
// }