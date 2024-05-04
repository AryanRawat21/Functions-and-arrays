import java.util.*;
  
  public class ABSubtraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int rv = 0;
       
       int pow = 1;
       int c = 0;
       while(n2 > 0){
           int d2 = n2 % 10;
           n2 = n2 / 10;
           int d1 = n1 % 10;
           n1 = n1 / 10;
           
           int d = 0;
           d2 = d2 + c; //for adding carry, last case
           
           if (d2 >= d1){
               c = 0;
               d = d2 - d1;
           } else {
               c = -1;
               d = d2 + b - d1;
           }
           rv = rv + pow * d;
           pow = pow * 10;
       }
       return rv;
   }
  
  }




// import java.util.*;

// public class ABSubtraction {
//     public static Scanner scn = new Scanner(System.in);

//     public static int anyBaseSubtraction(int n, int m, int b) {
//         int pow = 1, res = 0, borrow = 0;
//         while (m != 0) {
//             int diff = borrow + m % 10 - n % 10;
//             n /= 10;
//             m /= 10;

//             if (diff < 0) {
//                 diff += b;
//                 borrow = -1;
//             } else {
//                 borrow = 0;
//             }
//             res += diff * pow;
//             pow *= 10;

//         }
//         return res;
//     }

//     public static void main(String[] args) {
//         int b = scn.nextInt();
//         int n = scn.nextInt();
//         int m = scn.nextInt();
//         int d = anyBaseSubtraction(n, m, b);
//         System.out.println(d);
//     }
// }