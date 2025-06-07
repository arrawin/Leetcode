class Solution {
    public int numberOfStepsHelper(int num , int count)
    {
        if(num == 0){
            return count;
        }
        if(num%2==0){
           return numberOfStepsHelper(num/2 , count+1);
        }
        else{
           return numberOfStepsHelper(num-1 , count+1);
        }
    }
    public int numberOfSteps(int num) 
    {
        return numberOfStepsHelper(num,0);    
    }
}