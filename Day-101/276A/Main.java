import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int f=sc.nextInt();
            int t=sc.nextInt();
            if(t>k){
                ans=Math.max(ans,f-(t-k));
            }else{
                ans=Math.max(ans,f);
            }
        }
        System.out.println(ans);
    }
}