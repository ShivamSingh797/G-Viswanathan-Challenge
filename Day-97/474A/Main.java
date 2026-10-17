import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dir=sc.next();
        String s="qwertyuiopasdfghjkl;zxcvbnm,./";
        String s1=sc.next();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            int index = s.indexOf(ch);
            if (dir.equals("R")) {
                sb.append(s.charAt(index - 1));
            } else if (dir.equals("L")) {
                sb.append(s.charAt(index + 1));
            }
        }
        System.out.println(sb);
    }
}