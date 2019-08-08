class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        //put nums to the right place
        for(int i = 0; i < n; i++){
            while(nums[i] > 0 && nums[i] < n && nums[nums[i] - 1] != nums[i]){
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        //check if nums are in the right place
        for(int i = 0; i < n; i++){
            if(nums[i] != i + 1) return i + 1;
        }
        return n + 1;
    }
}