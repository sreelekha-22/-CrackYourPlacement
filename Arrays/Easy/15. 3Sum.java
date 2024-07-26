class Solution {
    public List<List<Integer>> threeSum(int[] b) {
        Arrays.sort(b);
        List<List<Integer>> a=new ArrayList<>();
        int n=b.length;
        for(int i=0;i<=n-3;i++){
            // skip same i's after one..
            if(i>0 && b[i]==b[i-1])continue;
            int j=i+1,k=n-1;
            while(j<k){
                if(b[j]+b[k]==-b[i]){
                    a.add(Arrays.asList(b[i],b[j],b[k]));
                    j++;k--;
                while(j<k && b[j]==b[j-1]){j++;}
                 while(j<k && b[k]==b[k+1]){k--;}

                }
                else if(b[j]+b[k] < -b[i]){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return a;
    }
}