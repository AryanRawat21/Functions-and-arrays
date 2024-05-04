import java.util.*;
public class ABTAB {
    public static Scanner scn = new Scanner(System.in);
    
    public static int anyBaseToDecimal(int n, int b) {
        int ans = 0, pow = 1;
        while (n != 0) {
            int rem = n % 10;
            n /= 10; // this is basically quotient value stored in n.
            ans += (rem * pow);

            pow *= b;
        }
        return ans;

    }

    public static int decimalToAnyBase(int n, int b) {
        int ans = 0, pow = 1;
        while (n != 0) {
            int rem = n % b;
            n /= b; // this is basically quotient value stored in n.
            ans += (rem * pow);

            pow *= 10;
        }
        return ans;

    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int decimalNumber = anyBaseToDecimal(n, b1);
        System.out.println(decimalToAnyBase(decimalNumber, b2));

    }

}