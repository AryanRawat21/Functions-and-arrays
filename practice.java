import java.util.*;

public class practice{
    public static Scanner scn = new Scanner(System.in);

    public static void display1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // get
        }
    }

    public static void input(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseOfArray(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void rotateOfArray2(int[] arr, int r) {
        int n = arr.length;
        r %= n;
        if (r < 0)
            r += n;

        reverseOfArray(arr, 0, n - 1);
        reverseOfArray(arr, 0, r - 1);
        reverseOfArray(arr, r, n - 1);
    }

    
     public static void main(String[] args) {
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        input(arr);
        int r = scn.nextInt();
        rotateOfArray2(arr,r);
        display1(arr);
    }
}