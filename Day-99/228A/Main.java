import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> has=new HashSet<>();
        for(int i=0;i<4;i++){
            int a=sc.nextInt();
            has.add(a);
        }
        int res=4-has.size();
        System.out.println(res);
    }
}
