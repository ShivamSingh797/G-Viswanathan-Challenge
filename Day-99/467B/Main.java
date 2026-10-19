import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        
        int[] arr=new int[m+1];
        for(int i=0;i<=m;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int fed=arr[m];
        for(int i=0;i<m;i++){
            int x=arr[i]^fed;
            int bits = Integer.bitCount(x);
 
            if (bits <= k) {
                count++;
            }
        }
        System.out.println(count);
    }
}