
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        
        int val1=(k*l)/nl;
        int val2=c*d;
        int val3 = p / np;
        int result=Math.min(Math.min(val1,val2),val3)/n;
        System.out.println(result);
    }
}