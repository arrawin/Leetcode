class Solution {
    public int[] findEvenNumbers(int[] digits) 
    {
        List<Integer> list =new ArrayList<>();
        int arr[] = new int[10];
        for(int i: digits)
        {
            arr[i]++;
        }
        for(int i=100;i<999;i=i+2)
        {
            int a=i%10;
            int b= (i/10)%10;
            int c = (i/10)/10;

            arr[a]=arr[a]-1;
            arr[b]=arr[b]-1;
            arr[c]=arr[c]-1;

            if(arr[a]>=0 && arr[b]>=0 && arr[c]>=0)
            {
                list.add(i);
            }
            arr[a]=arr[a]+1;
            arr[b]=arr[b]+1;
            arr[c]=arr[c]+1;
        }
        int ans[] = new int[list.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
        
    }
}