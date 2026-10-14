import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res=new int[n];
        for(int i=1;i<=n;i++){
            int d=arr[i];
            res[d-1]=i;
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i] + " ");
        }
    }
}
