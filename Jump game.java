// https://leetcode.com/problems/jump-game/submissions/1020662367/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i<nums.length; i++){
            if (i>reachable){
                return false;
            }
            reachable = Math.max(reachable , i+nums[i]);
        }
        return true;
    }
}
