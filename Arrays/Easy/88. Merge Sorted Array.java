class Solution {
    /*
    public void merge(int[] a, int m, int[] b, int n) {
        int i=0,j=0,k=0;
        int[] r=new int[m+n];
        while(i<m && j<n){
            if(a[i]<=b[j]){
                r[k++]=a[i++];
            }
            else{
                 r[k++]=b[j++];
            }
        }
        while(i<m){
             r[k++]=a[i++];
        }
        while(j<n){
             r[k++]=b[j++];
        }
        k=0;
        for(int x:r){
            a[k++]=x;
        }
    }
    */
     public void merge(int[] a, int m, int[] b, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while(j>=0){
            if( i>=0 && a[i]>b[j]){
                a[k--]=a[i--];
            }
            else{
                a[k--]=b[j--];
            }
        }
     }
}