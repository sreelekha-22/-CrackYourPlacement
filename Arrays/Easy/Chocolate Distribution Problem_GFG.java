/* 
class Solution{ 
    public:
        long long f(vector<long long> a, long long l, long long r, long long &ans, long long m){
        if (l >= r) return LONG_MAX;
        if (r - l + 1 < m) return LONG_MAX;
        ans = min(ans, a[r] - a[l]); // Update ans with the current minimum difference
        f(a, l + 1, r, ans, m);
        f(a, l, r - 1, ans, m);
        return a[r] - a[l];
        
        }
        long long findMinDiff(vector<long long> a, long long n, long long m){
        //code
             long long ans=LONG_MAX;
             sort(a.begin(),a.end());
             ans=a[n-1]-a[0];
             f(a,0,n-1,ans, m);
             return ans;
        }   
    };
    
    
    */
    class Solution
    {
        public long findMinDiff (ArrayList<Integer> a, int n, int m)
        {
            // your code here
            long r=Integer.MAX_VALUE;
            Collections.sort(a);
            int i=0,j=m-1;
            while(i <= n-m){
                r=Math.min(r,a.get(j)-a.get(i));
                i++;j++;
            }
            return r;
        }
    }