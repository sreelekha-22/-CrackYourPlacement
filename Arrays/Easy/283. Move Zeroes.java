class Solution {
    /* 
    // Hold zero, immediate non-zero element , swap them...
    public void moveZeroes(int[] a) {
        int n=a.length;
        int z=0,e=-1;
        while(e < n){
            while(z<n && a[z]!=0){
                z++;
            }
            e=z;
            while(e<n && a[e]==0){
                e++;
            }
            if(e==n)break;
            int t=a[e];
            a[e]=a[z];
            a[z]=t;

        }
    }
    */
   /*
    https://leetcode.com/problems/move-zeroes/solutions/172432/the-easiest-but-unusual-snowball-java-solution-beats-100-o-n-clear-explanation

The idea is that we go through the array and gather all zeros on our road.
*/
public void moveZeroes(int[] a) {
  int n=a.length;
        int snowBallSize =0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                snowBallSize++;
            }
            else if(snowBallSize > 0){
                int t=a[i];
                a[i]=0;
                a[i-snowBallSize]=t;
            }
        }
    }
}