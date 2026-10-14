import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int rem=240-k;
        int sum=0;
        int res=0;
        for(int i=1;i<=n;i++){
            sum=sum+5*i;
            if(sum<=rem){
                res++;
            }else{
                break;
            }
        }
        System.out.println(res);
    }
}