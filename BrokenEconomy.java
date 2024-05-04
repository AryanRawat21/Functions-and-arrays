import java.util.*;

public class BrokenEconomy{

    public static void main(String[] args) throws Exception {
       Scanner scn =new Scanner(System.in);
       int n=scn.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<arr.length;i++){
           arr[i]=scn.nextInt();
       }
       int m=scn.nextInt();
       int ceil=0;
       int floor=0;
       int lo=0;
       int hi=arr.length-1;
       while(lo<=hi){
           int mid=(lo+hi)/2;
           if(m<arr[mid]){
               hi=mid-1;
               ceil=arr[mid];
           }
           else if(m>arr[mid]){
               lo=mid+1;
               floor=arr[mid];
           }
           else{
               ceil=arr[mid];
               floor=arr[mid];
               break;
           }
       }
       System.out.println(ceil);
       System.out.println(floor);
    }

}