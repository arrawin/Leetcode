class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int l = arr.length;
        if(l<=1) return true;
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        for(int i = 2 ; i<l;i++){
            if(arr[i]-arr[i-1] !=diff) return false;
        }
        return true;
    }
}