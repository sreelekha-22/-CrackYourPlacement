class Solution {
    /* TC: O(m*n), SC=O(M+N)
    public void setZeroes(int[][] g) {
        HashSet<Integer>r = new HashSet<>() , c=new HashSet<>();
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]==0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for(int i:r){
            for(int k=0;k<g[0].length;k++){
                g[i][k]=0;
            }
        }
         for(int j:c){
            for(int k=0;k<g.length;k++){
                g[k][j]=0;
            }
        }
    }
    */
    // SC:O(1)
    public void setZeroes(int[][] g) {
        // MARK 0th row, 0th column for corresponding rows, cols to be zero
        // zc -> zero in 0th column, bcz g[0][0] -> track 0th row
        // update start rows at the last, bcz it is being depended on by others all.

        boolean fr=false,fc=false;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]==0){
                   if(i==0){fr=true;}
                   if(j==0){fc=true;}
                    g[i][0]=0;
                     g[0][j]=0;
                }
            }
        }

        for(int i=1;i<g.length;i++){
            for(int j=1;j<g[0].length;j++){
                if(g[i][0]==0 || g[0][j]==0){
                   
                    g[i][j]=0;
                    
                }
            }
        }

        if(fr){
             for(int j=0;j<g[0].length;j++){
                        g[0][j]=0;
             }
        }
        if(fc){
             for(int j=0;j<g.length;j++){
                        g[j][0]=0;
             }
        }
        
    }

}