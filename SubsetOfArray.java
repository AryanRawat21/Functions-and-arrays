import java.util.*;

public class SubsetOfArray {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void arraySubset(int[] arr) {
        int limit = (int) Math.pow(2, arr.length);
        for (int i = 0; i < limit; i++) {
            String set = "";
            int temp = i;

            for (int j = arr.length - 1; j >= 0; j--) {
                int r = temp % 2;
                temp /= 2;

                if (r == 0) {
                    set = "-\t" + set;
                } else {
                    set = arr[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        arraySubset(arr);
    }
}