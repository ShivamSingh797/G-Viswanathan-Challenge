 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int mini=Integer.MAX_VALUE;
        int i=0;
        int j=n-1;
        while(j<m){
            mini=Math.min(mini,arr[j]-arr[i]);
            i++;
            j++;
        }
        System.out.println(mini);
    }
}