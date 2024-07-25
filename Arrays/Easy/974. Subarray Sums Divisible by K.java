class Solution {
    /* 
    Pepcoding
    -----x(rem)
    -----------------------x(rem)
         ------------------0(rem) => div by k (sum is div by k)
     */
    public int subarraysDivByK(int[] a, int k) {
        int c=0;
        int n=a.length,s=0,r=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
        for(int i=0;i<n;i++){
            s+=a[i];
           r=s%k;
           if(r<0){
            //(-y is rem)   =>  km-y  => km-y+k-k => k(m-1) + (k-y) => rem = -y+k
            r+=k;
           }
           
           if(h.containsKey(r)){
            c+=h.get(r);
            h.put(r,h.get(r)+1);
           }
           else{
            h.put(r,1);
           }
        }
        return c;
    }
}