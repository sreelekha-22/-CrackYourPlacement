class Solution {
    // utilise the hint [1,n]  => can travel to indices via values
    // mark that index(val) as visited -> -ve
    public List<Integer> findDuplicates(int[] a) {
        List<Integer> l=new ArrayList<>();
        
        for(int i=0;i<a.length;i++){
            int abs_v = Math.abs(a[i]);
          int v=a[abs_v-1];
            if(v<0)l.add(abs_v);

            a[abs_v-1]=-a[abs_v-1];
            
        }
        return l;
    }
}