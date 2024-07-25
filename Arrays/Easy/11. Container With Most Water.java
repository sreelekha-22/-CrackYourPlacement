class Solution {
    public int maxArea(int[] h) {
        int ma=0,l=0,r=h.length-1;
        while(l<r){
            ma=Math.max(ma,(r-l)*Math.min(h[l],h[r]));
            if(h[l]>h[r]){
                //retain taller height
                r--;
            }
            else{
                l++;
            }
        }
return ma;
    }
}