import java.io.*;
import java.util.*;

public class ElementInArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
    } 
    
    int data = scn.nextInt();
    int idx = -1;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == data){
            idx = i;
            break;
        }
        
    }
    System.out.println(idx);
    
 }

}



// import java.util.*;

// public class ElementInArray{
//     public static Scanner scn = new Scanner(System.in);



//     public static int[] input2(int n) {
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();
//         }
//         return arr;
//     }



    
//     public static int find(int[] arr, int d) {
//         int foundAtIndex = -1;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == d) {
//                 foundAtIndex = i;
//                 break;
//             }
//         }

//         return foundAtIndex;
//     }
//     public static void main(String[] args) {
//         int n = scn.nextInt();
//         int[] arr = input2(n);
//         int d = scn.nextInt();
      
//         System.out.print(find(arr,d));
//     }
// }
