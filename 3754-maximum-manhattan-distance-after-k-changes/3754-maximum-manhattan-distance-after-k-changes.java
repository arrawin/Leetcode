class Solution {
    // Class level variables to store the character array and the integer k
    private char[] directionArray;
    private int k;

    // Main method to find the maximum distance based on the given conditions
    public int maxDistance(String s, int k) {
        // Initialize the class variables
        this.directionArray = s.toCharArray();
        this.k = k;

        // Calculate maximum distances for each pair of directions
        int max_SE = calculateDistance('S', 'E');
        int max_SW = calculateDistance('S', 'W');
        int max_NE = calculateDistance('N', 'E');
        int max_NW = calculateDistance('N', 'W');

        // Return the maximum distance among all calculated distances
        return Math.max(Math.max(max_SE, max_SW), Math.max(max_NE, max_NW));
    }

    // Helper method to calculate the distance for a given pair of directions
    private int calculateDistance(char direction1, char direction2) {
        int currentMax = 0; // Current running max distance
        int maxDistance = 0; // Overall max distance found
        int replacementCount = 0; // Count of non-direction characters replaced

        // Iterate over each character in the direction array
        for (char currentDirection : directionArray) {
            // Increment the current max if the character matches one of the interested directions
            if (currentDirection == direction1 || currentDirection == direction2) {
                ++currentMax;
            } else if (replacementCount < k) { // Replace non-direction chars if replacements are available
                ++currentMax;
                ++replacementCount;
            } else {
                --currentMax; // Decrement the current max if no more replacements can be made
            }
            // Update the max distance if the current calculated distance is greater
            maxDistance = Math.max(maxDistance, currentMax);
        }
        return maxDistance; // Return the calculated max distance
    }
}