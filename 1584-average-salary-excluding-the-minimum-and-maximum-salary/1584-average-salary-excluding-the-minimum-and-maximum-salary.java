class Solution {
    public double average(int[] salary) {
        int max_val = Integer.MIN_VALUE;
        int min_val = Integer.MAX_VALUE;
        int sum = 0;
        int ind;
        for(ind = 0 ; ind < salary.length ; ind++)
        {
                sum+=salary[ind];
                if(salary[ind]>max_val) {max_val = salary[ind];}
                if(salary[ind]<min_val) {min_val = salary[ind];}

        }
        System.out.print(min_val);
        return (double)(sum-(max_val+min_val))/(salary.length-2);
        
    }
}