class Solution {
    
    public int removeDuplicates(int[] a) {
        int n=a.length;
       int u=0,j=1;
        while(j<n){
            while(j<n && a[j]==a[u]){
               j++;
            }
            if(j==n)break;
            u++;
            a[u]=a[j];
             
        }
        return u+1;
    }
}