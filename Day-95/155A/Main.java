import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxi=arr[0];
        int mini=arr[0];
        int count=0;
        for(int i=1;i<n;i++){
            if(arr[i]>maxi){
                count++;
                maxi=Math.max(arr[i],maxi);
            }else if(arr[i]<mini){
                count++;
                mini=Math.min(arr[i],mini);
            }
        }
        System.out.println(count);
    }
}
