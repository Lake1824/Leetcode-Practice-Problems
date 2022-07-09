class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean condition = false;
        int[] indices = new int[2];
        for(int i = 0; i < nums.length && !condition; i++){
            for(int j = i + 1; j < nums.length && !condition; j++){
                if(nums[i] + nums[j] == target){
                    condition = true;
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }
}
