import java.io.*;
import java.util.*;

public class SumOfArrays{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    for(int i=0; i < arr1.length; i++){
        arr1[i] = scn.nextInt();
    }
    
    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0; i < arr2.length; i++){
        arr2[i] = scn.nextInt();
    }
    
    int[] sum = new int[n1 > n2 ? n1 : n2];
    int c = 0;  //carry
    
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int k = sum.length - 1;
    
    while(k >= 0){
        int dig = c;
        if(i >= 0){
            dig = dig + arr1[i];
        }
        if(j >= 0){
            dig = dig + arr2[j];
        }
        
        c = dig/10;
        dig = dig % 10;
        sum[k] = dig;
        
        i--;
        j--;
        k--;
    }
    if( c != 0){
        System.out.println(c);
    }
    
    for(int val : sum){
        System.out.println(val);
    }

 }

}

// import java.util.*;

// public class SumOfArrays {
//     public static Scanner scn = new Scanner(System.in);

//     public static int[] input1(int n) {
//         int[] arr1 = new int[n];
//         for (int i = 0; i < arr1.length; i++) {
//             arr1[i] = scn.nextInt();
//         }
//         return arr1;
//     }

//     public static int[] input2(int m) {
//         int[] arr2 = new int[m];
//         for (int i = 0; i < arr2.length; i++) {
//             arr2[i] = scn.nextInt();
//         }
//         return arr2;
//     }

//     public static void sumOFArray(int[] arr1, int[] arr2) {
//         int n = arr1.length;
//         int m = arr2.length;
//         int p = Math.max(n,m) + 1;
//         int[] ans = new int[p];

//         int i = n - 1, j = m - 1, k = p - 1, carry = 0;
//         while (k >= 0) {
//             int sum = carry + (i >= 0 ? arr1[i] : 0) + (j >= 0 ? arr2[j] : 0);
//             ans[k] = sum % 10;
//             carry = sum / 10;

//             i--;
//             j--;
//             k--;
//         }
//         for (int idx = 0; idx < p; idx++) {
//             if (idx == 0 && ans[idx] == 0)
//                 continue;
//             System.out.println(ans[idx]);
//         }
//     }

//     public static void main(String[] args) {
//         int n = scn.nextInt();
//         int[] arr1 = input1(n);
//         int m = scn.nextInt();
//         int[] arr2 = input2(m);
//         sumOFArray(arr1, arr2);
//     }

// }