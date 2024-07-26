class Solution {
    /* NEETCODE 
    [1,2,3,4,5,6,1], k = 3
             - - -
     -          - -
     - -          -
    */
    public int maxScore(int[] p, int k) {
        int s=0,n=p.length,c=0;
        for(int i=n-k;i<n;i++){
            s+=p[i];
        }
        c=s;
        int l=0,r=n-k;
        while(r<n){
            s+= (p[l++]-p[r++]);
            c=Math.max(c,s);
        }
        return c;
    }
}