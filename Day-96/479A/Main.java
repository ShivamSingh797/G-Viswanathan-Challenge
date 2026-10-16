import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int ans=0;
        int a1=a+b*c;
        int a2=a*b+c;
        ans=Math.max(ans,Math.max(a1,a2));
        
        int a3=(a+b)*c;
        int a4=a+(b*c);
        ans=Math.max(ans,Math.max(a3,a4));
        
        int a5=(a*b)+c;
        int a6=a*(b+c);
        ans=Math.max(ans,Math.max(a5,a6));
        
        int a7=a*b*c;
        int a8=a+b+c;
        ans=Math.max(ans,Math.max(a7,a8));
        
        
        System.out.println(ans);
    }
}