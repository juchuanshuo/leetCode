class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        //停止循环的标志
        boolean end = false;
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if( i == j){
                	//当数组下标一致时跳过此循环，因为每个数字仅被使用1次
                    continue;
                }
                if(target == (nums[i] + nums[j])){
                    result[0] = i;
                    result[1] = j;
                    end = true;
                    break;
                }
            }
            if(end){//当得到结果时，终止接下来的操作
                break;
            }
        }
        return result;
    }
}
