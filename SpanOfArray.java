import java.util.*;


public class SpanOfArray{
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

    }

    public static void spanArray(int[] arr) {
      
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println( max - min);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];

        input(arr);
      
      spanArray(arr);


    }
}