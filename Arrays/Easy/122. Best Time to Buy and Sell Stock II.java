class Solution {
    public int maxProfit(int[] a) {
        int n=a.length;
        int b=0,s=0,p=0;
        for(int i=1;i<n;i++){
            if(a[i]>=a[i-1]){
                s++;
            }
            else{
            p+=a[s]-a[b];
            b=s=i;
            }
            
        }
        p+=a[s]-a[b];
        return p;
    }
}