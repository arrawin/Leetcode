class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals , (a,b)->Integer.compare(a[0] , b[0]));
        for(int[] current_interval : intervals)
        {
            if ( res.size() == 0 )
            {
                res.add(current_interval);
            }
            else
            {
                int[] prev_interval = res.get(res.size() - 1);
                if( prev_interval[1] >= current_interval[0])
                {
                    prev_interval[1] = Math.max(prev_interval[1],current_interval[1]);
                    res.set(res.size() - 1,prev_interval);
                }
                else{
                    res.add(current_interval);
                }
                
            }
        }  
        return res.toArray(new int[res.size()][]);      
    }
}