class Solution {
    public List<Integer> spiralOrder(int[][] g) {
        List<Integer> a=new ArrayList<>();
        int r=g.length,c=g[0].length,e=0;
        int sr=0,er=r-1,sc=0,ec=c-1;
        while(e<r*c){
            for(int i=sc;e<r*c && i<=ec;i++){
                a.add(g[sr][i]);
                e++;
            }
            sr++;

             for(int i=sr;e<r*c && i<=er;i++){
                a.add(g[i][ec]);
                 e++;
            }
            ec--;

            for(int i=ec;e<r*c && i>=sc;i--){
                a.add(g[er][i]);
                 e++;
            }
            er--;

            for(int i=er;e<r*c && i>=sr;i--){
                a.add(g[i][sc]);
                e++;
            }
            sc++;

        }
        return a;

    }
}