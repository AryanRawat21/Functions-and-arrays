import java.util.*;

public class ABMultiplication{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     // write your code here
     int rv = 0;
     int p = 1;
     while (n2 > 0){
         int d2 = n2 % 10;
         n2 = n2 / 10;
         
         int sprd = getProductWithASingleDigit(b, n1, d2);  //single product
         rv = getSum(b, rv, sprd* p);   //p for allignment and adding
         p = p * 10;
     }
     return rv;
 }
 
 public static int getProductWithASingleDigit(int b, int n1, int d2){
     int rv = 0;
     
     int p = 1;
     int c = 0;
     while(n1 != 0 || c != 0){
         int d1 = n1 % 10;
         n1 = n1 / 10;
         
         int d = d1 * d2 + c;
         c = d / b;
         d = d % b;
         
         rv = rv + p * d;
         p = p * 10;
     }
     return rv;
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








// import java.util.*;

// public class ABMultiplication{

// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int b = scn.nextInt();
//     int n1 = scn.nextInt();
//     int n2 = scn.nextInt();

//     int d = getProduct(b, n1, n2);
//     System.out.println(d);
//  }

// public static int getSum(int b, int n1, int n2 , int carry){
//        int sum = 0 ;
//        int ans = 0 ;
//        int pow = 1 ;
//        while(n1 != 0 || n2 != 0 || carry != 0){
//            sum = carry + n1%10 + n2%10 ;
//            n1 /= 10 ;
//            n2 /= 10 ;
//            int digit = sum % b ;
//            carry = sum / b ;
//            ans += digit * pow ;
//            pow *= 10 ;
//        }
//        return ans ;
//     } 
 
//  public static int multiplySingleDigit(int n , int d , int b){
//     int pow = 1 , ans = 0 , carry = 0 ;
//     while(n != 0 || carry != 0){
//         int prod = (n%10) * d +carry ;
//         n /= 10 ;
//         int digit = prod % b ;
//         carry = prod / b ;
//         ans += digit * pow ;
//         pow *= 10 ;
//     } 
//     return ans ;
//  }
 
//  public static int getProduct(int b, int n1, int n2){
//      int ans = 0 , pow = 1 ;
//     while(n1 != 0){
//         int d = n1 % 10 ;
//         n1 /= 10 ;
//         int recAns = multiplySingleDigit(n2 , d , b) * pow ;
//         ans = getSum(b , ans , recAns , 0) ;
//         pow *= 10 ;
//     } 
//     return ans ;
//  }

// }