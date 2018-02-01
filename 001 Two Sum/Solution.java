class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if( i == j){
                	//当数组下标一致时跳过此循环，因为每个数字仅被使用1次
                    continue;
                }
                if(target == (nums[i] + nums[j])){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
