import java.util.*;

public class DTAB{
    public static Scanner scn = new Scanner(System.in);

    public static int decimaltoanybase(int n,int b){
        int pow = 1;
        int ans = 0;
        while(n!=0){
            int rem = n%b;
            n/=b;

            ans = ans + rem*pow;
            pow = pow*10;
        }
        return ans;
    }

    public static void main(String[] args){
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(decimaltoanybase(n,b));
    }
}