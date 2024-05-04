import java.util.*;

public class DTB{
    public static Scanner scn = new Scanner(System.in);

    public static int decimaltobinary(int n){
        int pow = 1;
        int ans = 0;
        while(n!=0){
            int rem = n%2;
            n/=2;

            ans = ans + rem*pow;
            pow = pow*10;
        }
        return ans;
    }

    public static void main(String[] args){
        int n = scn.nextInt();
        System.out.println(decimaltobinary(n));
    }
}