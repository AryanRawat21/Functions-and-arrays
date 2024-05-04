import java.io.*;
import java.util.*;

public class SubtractOfTwoArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    for(int i = 0; i < arr1.length; i++){
        arr1[i] = scn.nextInt();
    }
    
    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    for(int i = 0; i < arr2.length; i++){
        arr2[i] = scn.nextInt();
    }
    
    int[] diff = new int[n2];
    int c = 0;
    
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int k = diff.length - 1;
    
    while(k >= 0){
        int dig = 0;
        int arr1v = i >= 0? arr1[i]:0;
        
        if(arr2[j] + c >= arr1v){
            dig = arr2[j] + c - arr1v;
            c = 0;
        }
        
        else {
            dig = arr2[j] + c + 10 - arr1v;
            c = -1;
        }
        
        diff[k] = dig;
        
        i--;
        j--;
        k--;
    }
    
    int idx = 0;
    while(idx < diff.length){
        if(diff[idx] == 0){
            idx++;
        }
        else {
            break;
        }
        
    }
    
    while(idx < diff.length){
        System.out.println(diff[idx]);
        idx++;
    }
 }

}






// import java.util.*;

// public class SubtractOfTwoArray{
//     public static Scanner scn = new Scanner(System.in);

// public static void main(String[] args) throws Exception {
//     // write your code here 
//     int[] arr1 = takeInput(scn.nextInt());
//     int[] arr2 = takeInput(scn.nextInt());
    
//     differenceOfTwoArray(arr1,arr2);
//  }
 
//  public static int[] takeInput(int n){
//      int[] arr = new int[n];
//      for(int i =0;i<n;i++)
//      arr[i] = scn.nextInt();
//      return arr;
//  }
 
 
//  public static void differenceOfTwoArray(int[] arr1, int[] arr2){
//      int n = arr1.length;
//      int m = arr2.length;
//      int[] ans = new int[m];
     
//      int i = n-1, j=m-1, k=m-1;
//      int borrow = 0;
//      while(k >= 0){
//          int diff = borrow + arr2[j] - (i >= 0 ? arr1[i] :0);
//          if(diff < 0){
//              diff += 10;
//              borrow = -1;
//          }else {
//              borrow = 0;
//          }
//          ans[k] = diff;
//          i--;
//          j--;
//          k--;
//      }
//      boolean nonZeroFound = false;
//      for(int ele : ans){
//          if(ele != 0){
//              nonZeroFound = true;
//          }
//          if(nonZeroFound)
//          System.out.println(ele);
         
     
         
//  }
// }
// }