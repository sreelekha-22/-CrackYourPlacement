class Solution {
    public boolean canJump(int[] a) {
       int n=a.length,g; 
       // g=> goal -> if u reach this index, ans is achieved
        g=n-1;

       
        for(int j=n-2;j>=0 ;j--){
            if(j+a[j]>=g){
                g=j;
            }
        }
        return g==0;
    }
}