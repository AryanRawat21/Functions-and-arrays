import java.io.*;
import java.util.*;

public class RotateAnArray2{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

    public static void reverse(int[] a, int i, int j){
        int li = i;
        int ri = j;
        while(li < ri){
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            
            li++;
            ri--;
        }
    }
  public static void rotate(int[] a, int k){
    // write your code here
    k = k % a.length;
    
    if(k < 0){
        k = k + a.length;
    }
    
    //part 1
    reverse(a, 0, a.length - k - 1);
    
    //part 2
    reverse(a, a.length - k, a.length - 1);
    
    //part 3
    reverse(a, 0, a.length - 1);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}


// import java.util.*;

// public class RotateAnArray2{
//     public static Scanner scn = new Scanner(System.in);

//     public static void display1(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " "); // get
//         }
//     }

//     public static int[] input2(int n) {
//         int[] arr = new int[n];
        
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();
//         }
//         return arr;
//     }

//     public static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void reverseOfArray(int[] arr, int i, int j) {
//         while (i < j) {
//             swap(arr, i, j);
//             i++;
//             j--;
//         }
//     }

//     public static void rotateOfArray2(int[] arr, int r) {
//         int n = arr.length;
//         r %= n;
//         if (r < 0)
//             r += n;

//         reverseOfArray(arr, 0, n - 1);
//         reverseOfArray(arr, 0, r - 1);
//         reverseOfArray(arr, r, n - 1);
//     }

    
//      public static void main(String[] args) {
//         int n = scn.nextInt();
        
//         int[] arr = input2(n);
//         int r = scn.nextInt();
//         rotateOfArray2(arr,r);
//         display1(arr);
//     }
// }