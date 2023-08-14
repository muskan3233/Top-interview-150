// https://leetcode.com/problems/h-index/submissions/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);  // Sort the citations array in descending order
        
        int n = citations.length;
        int hIndex = 0;
        
        for (int i = 0; i < n; i++) {
            // Calculate the potential h-index value based on the current citation and its position
            int potentialHIndex = i + 1;
            
            // Check if the current citation value is greater than or equal to the potential h-index
            if (citations[n - 1 - i] >= potentialHIndex) {
                hIndex = potentialHIndex;  // Update the h-index
            } else {
                break;  // Stop the loop, as further citations will be even smaller
            }
        }
        
        return hIndex;
    }
}
