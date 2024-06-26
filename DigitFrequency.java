import java.util.*;

public class DigitFrequency {

    public static int getDigitFrequency(int n, int d) {
        int count = 0;
        while(n != 0){
            int lastDigit = n%10;
            n /= 10;
            
            if(lastDigit == d){
                count++;
            }
        }
       return count;
     }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    
}