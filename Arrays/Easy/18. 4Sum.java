class Solution {
    /*
    // TC: O(N^(3)) SC:O(1)
    public List<List<Integer>> fourSum(int[] b, int t) {
        Arrays.sort(b);
        List<List<Integer>> a=new ArrayList<>();
        int n=b.length;
        for(int i=0;i<=n-4;i++){
            // skip same i's after one..
            if(i>0 && b[i]==b[i-1])continue;
            for(int p=i+1;p<=n-3;p++){
                 if(p>i+1 && b[p]==b[p-1])continue;
            int j=p+1,k=n-1;
            long v=t-(b[i]+(long)b[p]);
            while(j<k){
                if((long)b[j]+b[k]==v){
                    a.add(Arrays.asList(b[i],b[p],b[j],b[k]));
                    j++;k--;
                while(j<k && b[j]==b[j-1]){j++;}
                 while(j<k && b[k]==b[k+1]){k--;}

                }
                else if((long)b[j]+b[k]<v){
                    j++;
                }
                else{
                    k--;
                }
            }
            }
        }
        return a;
    }
    */

// Recursion => ksum => TC:o(N^(K-1)) ;   SC:o(K) => O(N)
public List<List<Integer>> twoSum(int[] b, long t,int p,int n){
    List<List<Integer>> a=new ArrayList<>();
    int j=p,k=n-1;
            while(j<k){
                if((long)b[j]+b[k]==t){
                    a.add(Arrays.asList(b[j],b[k]));
                    j++;k--;
                while(j<k && b[j]==b[j-1]){j++;}
                 while(j<k && b[k]==b[k+1]){k--;}

                }
                else if((long)b[j]+b[k]<t){
                    j++;
                }
                else{
                    k--;
                }
            }
            return a;
}
     public List<List<Integer>> fourSum(int[] b, int t) {
        Arrays.sort(b);
        int k=4;
        return ks(b,t,0,k);
     }

     public List<List<Integer>> ks(int[] b, long t,int idx,int k) {
         List<List<Integer>> res = new ArrayList<>();
         int n= b.length;
         if(idx ==n){
            return res;
         }
         long avg_v=t/k;
         if(b[idx] > avg_v || b[n-1]<avg_v){
            return res;
         }

         if(k==2){
            return twoSum(b,t,idx,n);
         }
         for(int i=idx;i<n;i++){
            if(i==idx || b[i]!=b[i-1]){
            for(List<Integer> subset : ks(b,t-b[i],i+1,k-1)){
                res.add(new ArrayList<>(Arrays.asList(b[i])));
                res.get(res.size()-1).addAll(subset);
            }
            }
         }
         return res;
     }
}