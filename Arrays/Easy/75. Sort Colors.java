/*
0 - j-1   0's    => before j
j - i-1   1's    => before i
i - k        unlnown
k+1 - end  2's   => after k


At first if u find 2 => swap with k(end)
so, when u get 0 => u will swap with j => j can only be 0,1 => so i++
*/

class Solution {
    void swap(int[] a, int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public void sortColors(int[] a) {
        int j=0,i=0,k=a.length-1;
        while(i<=k){
            if(a[i]==2){
                swap(a,i,k);
                k--;
            }
            else if(a[i]==0){
                swap(a,i,j);
                j++;
                i++;
            }
            else if(a[i]==1){
                i++;
            }
        }
    }
}