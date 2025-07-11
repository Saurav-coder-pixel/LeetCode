class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length-i-1; j++){
                if(nums[j]> nums[j+1]){
                    int temp =nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]= temp;
                }
                // System.out.println(nums);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(i!= nums[i]){
                // System.out.println(i);
                return i;
            }
        }
        return nums.length;
    }
}
