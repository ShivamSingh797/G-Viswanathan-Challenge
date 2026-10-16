import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        ArrayList<Integer> a3=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                a1.add(i+1);
            }else if(arr[i]==2){
                a2.add(i+1);
            }else{
                a3.add(i+1);
            }
        }
        if(a1.size()==0 || a2.size()==0 || a3.size()==0){
            System.out.println(0);
            return;
        }
        int maxi=Math.min(a1.size(),Math.min(a2.size(),a3.size()));
        System.out.println(maxi);
        for(int i=0;i<maxi;i++){
            System.out.print(a1.get(i)+ " ");
            System.out.print(a2.get(i)+ " ");
            System.out.print(a3.get(i)+ " ");
            System.out.println();
        }
    }
}