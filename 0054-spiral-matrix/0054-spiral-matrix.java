class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;
        List<Integer> results = new ArrayList<>();

        while (top <= bottom && left <= right) {
            //left to right
            for (int i = left; i <= right; i++) {
                results.add(matrix[top][i]);
            }
            top++;

            //top to bottom
            for (int i = top; i <= bottom; i++) {
                results.add(matrix[i][right]);
            }
            right--;

            //right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    results.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    results.add(matrix[i][left]);
                }
                left++;
            }
        }
        return results;
    }
}
