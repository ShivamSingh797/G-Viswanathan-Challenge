import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        String ini = sc.next();
        for (int i = 1; i < n; i++) {
            String a = sc.next();
            if (!ini.equals(a)) {
                count++;
                ini = a;
            }
        }
        System.out.println(count);
    }
}