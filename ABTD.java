import java.util.*;

public class ABTD{
    public static Scanner scn = new Scanner(System.in);

    public static int anybasetodecimal(int n,int b){
        int pow = 1;
        int ans = 0;
        while(n!=0){
            int rem = n%10;
            n/=10;

            ans = ans + rem*pow;
            pow = pow*b;
        }
        return ans;
    }

    public static void main(String[] args){
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(anybasetodecimal(n,b));
    }
}