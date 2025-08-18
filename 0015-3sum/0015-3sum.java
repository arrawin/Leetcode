class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        mergeSort(nums, 0, nums.length - 1); // Step 1: sort

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicate 'i' values
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left pointer
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for right pointer
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Need a bigger sum
                } else {
                    right--; // Need a smaller sum
                }
            }
        }

        return result;
    }

    public void mergeSort(int[] arr, int l, int r) {
        if(l>=r) {
            return;
        }

        int m = l + (r-l)/2;

        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);

        merge(arr, l, m, r);
    }

    public void merge(int[] arr, int l, int m, int r) {
        int n1 = m-l+1;
        int n2 = r-m;

        int[] a1 = new int[n1];
        int[] a2 = new int[n2];

        for(int i=0; i<n1; i++) {
            a1[i] = arr[l+i];
        }
        for(int i=0; i<n2; i++) {
            a2[i] = arr[m+1+i];
        }

        int k = l;
        int p = 0;
        int q = 0;
        while(p<n1 && q<n2) {
            if(a1[p]<=a2[q]) {
                arr[k++] = a1[p++];
            }
            else {
                arr[k++] = a2[q++];
            }
        }

        while(p<n1) {
            arr[k++] = a1[p++];
        }
        while(q<n2) {
            arr[k++] = a2[q++];
        }
    }
}