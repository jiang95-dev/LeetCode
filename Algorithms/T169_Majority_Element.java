class Solution {
    public int majorityElement(int[] nums) {
        int res = nums[0], count = 1;
        for(int i = 1; i < nums.length; i++){
            if(count == 0) res = nums[i];
            if(res == nums[i]) count++;
            else count--;
        }
        return res;
    }
}