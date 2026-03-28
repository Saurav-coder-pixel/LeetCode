class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n= nums.length;
        int value= 1;

        for(int i=0; i<n; i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i], value++);
                return true;
            }else{
                mp.put(nums[i], value);
            }
        }
        return false;
    }
}
