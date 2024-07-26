class Solution {
    public int subarraySum(int[] a, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
        int c=0,s=0,n=a.length;
        for(int i=0;i<n;i++){
            s+=a[i];
            if(h.containsKey(s-k)){
                c+=h.get(s-k);
            }

                h.put(s,h.getOrDefault(s,0)+1);

        }
return c;
    }
}