class Solution {
    /*
    Moore Algo
    // inc votes -> occurs more ;;; else decrease -> decreasing the priority  ;;; 0 votes -> present is potential candidate
    */
    public int majorityElement(int[] a) {
        int v=a[0],c=1;
        for(int i=1;i<a.length;i++){
            if(a[i]==v)c++;
            else {
                c--;
            }

            if(c==0){
                v=a[i];
                c=1;
            }
        }
        return v;
    }
}