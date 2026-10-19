import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            String s = sc.next();
            ArrayList<Character> list = new ArrayList<>();
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (i == 0 || ch != s.charAt(i - 1)) {
                    if (list.contains(ch)) {
                        flag = false;
                        break;
                    }
                    list.add(ch);
                }
            }
            System.out.println(flag ? "YES" : "NO");
            t--;
        }
        
        sc.close();
    }
}