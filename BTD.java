import java.util.*;

public class BTD{
    public static Scanner scn = new Scanner(System.in);

    public static int binarytodecimal(int n){
        int pow = 1;
        int ans = 0;
        while(n!=0){
            int rem = n%10;
            n/=10;

            ans = ans + rem*pow;
            pow = pow*2;
        }
        return ans;
    }

    public static void main(String[] args){
        int n = scn.nextInt();
        System.out.println(binarytodecimal(n));
    }
}

