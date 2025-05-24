class Solution {

    // Function to perform quicksort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);  
            quickSort(arr, low, pivotIndex - 1);         
            quickSort(arr, pivotIndex + 1, high);        
        }
    }

    // Partition function
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choose last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    // Swap helper
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public List<Integer> targetIndices(int[] nums, int target) {
        quickSort(nums , 0 , nums.length-1);
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
        return list;
        
    }
}