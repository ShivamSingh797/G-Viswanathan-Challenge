class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        int[] a=new int[9];
        for (int i = 0; i < 9; i++) {
            a[i] = i + 1;
        }
        combination(0,a,n,k,ans,curr);
        return ans;
    }
    public void combination(int index,int[] a,int n,int k,List<List<Integer>> ans,ArrayList<Integer> curr){
        int num=a.length;
        if (n == 0 && curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if (n <= 0 || curr.size() >= k || index == a.length) {
            return;
        }
        for(int i=index;i<num;i++){
            curr.add(a[i]);
            combination(i+1,a,n-a[i],k,ans,curr);
            curr.remove(curr.size()-1);
        }
    }
}
