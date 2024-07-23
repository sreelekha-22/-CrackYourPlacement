class Solution {
    public int maxProfit(int[] a) {
        int j=-1,v=Integer.MAX_VALUE,p=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<v){
                v=a[i];
                j=i;
            }
           
                p=Math.max(p,a[i]-v);
            
        }
        return p;


    }
}