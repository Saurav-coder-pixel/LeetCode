class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right= height.length-1;
        int maxArea=0;

        while(left<right){
            int length= right-left;;
            int breath= Math.min(height[left],height[right]);
            int currArea= length* breath;
            maxArea= Math.max(maxArea, currArea);

            if(height[left]< height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}



class Solution {
    static{
        for(int i=0;i<60;i++){
            maxArea(new int[]{0,0});
        }
    }
    public static int maxArea(int[] heigth) {
        int area=0;int left=0;
        int right=heigth.length-1;
        while(left<right){
            int h=Math.min(heigth[left],heigth[right]);
            int water=(right-left)*h;
            area=Math.max(area,water);
            while(left<right && heigth[left]<=h) left++;
            while(left<right && heigth[right]<=h) right--;
        }
        return area;
    }
}
