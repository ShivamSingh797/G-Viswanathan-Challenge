
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int count=0;
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0;
        while(i<n){
            if(s.charAt(i) == 'B'){
                count++;
                int res=0;
                int j=i;
                while(j < n && s.charAt(j) == 'B'){
                    res++;
                    j++;
                }
                arr.add(res);
                i=j;
            }else{
                i++;
            }
        }
        System.out.println(count);
        for(int x:arr){
            System.out.print(x + " ");
        }
    }
}