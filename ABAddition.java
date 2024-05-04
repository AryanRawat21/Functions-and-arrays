import java.util.*;
  
  public class ABAddition{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int rv = 0;
       
       int c = 0;
       int pow = 1;
       while(n1 > 0 || n2 > 0 || c > 0){
           int d1 = n1 % 10;
           int d2 = n2 % 10;
           n1 = n1 / 10;
           n2 = n2 / 10;
           
           int d = d1 + d2 + c; //digit
           c = d / b;
           d = d % b;   //remaining digits
           
           rv = rv + pow*d;
           pow = pow * 10;
       }
       return rv;
   }
  }







//  import java.util.*;

// public class ABAddition {

//     public static Scanner scn = new Scanner(System.in);

//     public static int anyBaseAddition(int n, int m, int b) {
//         int ans = 0;
//         int pow = 1;
//         int carry = 0;
//         while (n != 0 || m != 0 || carry != 0) {
//             int sum = carry + n % 10 + m % 10;
//             n /= 10;
//             m /= 10;

//             int digit = sum % b;
//             carry = sum / b;

//             ans += (digit * pow);
//             pow *= 10;

//         }
//         return ans;
//     }

//     public static void main(String[] args){
//         int b = scn.nextInt();
//         int n = scn.nextInt();
//         int m = scn.nextInt();

//         System.out.println(anyBaseAddition(n, m, b));
//     }

// }