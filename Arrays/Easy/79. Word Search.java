class Solution {
    int[][] d={{0,1},{1,0},{0,-1},{-1,0}};
    int m,n,l;
    public boolean find(char[][] g, String w,int i,int j,int k) {
        // word is found
        if(k==l)return true;
        if(i<0 || i>=m || j<0 || j>=n || g[i][j]=='$') return false;
        if(w.charAt(k) != g[i][j]) return false;
        // char is matched.. -> mark as vis 
        char temp =  g[i][j];
        g[i][j]='$';

        // explore neighbors for next char in word
        for(int[] z:d){
            if(find(g,w,i+z[0],j+z[1],k+1)) return true;
        }
        // didn't find among neghbors
         g[i][j]=temp;
         return false;
    }
    public boolean exist(char[][] g, String w) {
        m=g.length;n=g[0].length;l=w.length();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(w.charAt(0) == g[i][j] && find(g,w,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
}