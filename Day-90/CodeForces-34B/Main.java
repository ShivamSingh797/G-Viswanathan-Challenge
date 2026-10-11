import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < m; i++) {
            if (a[i] < 0) {
                ans -= a[i];
            } else {
                break;
            }
        }
        System.out.println(ans);
    }
}