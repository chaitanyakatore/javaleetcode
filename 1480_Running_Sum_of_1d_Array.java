//leetcode question no. 1480 

method 1:
class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] sum = new int[len];

        for(int i=0;i<nums.length;i++){
            if(i==0){
                sum[0]=nums[0];
            }
            else{
                sum[i]=nums[i]+sum[i-1];
            }
        }
        return sum;
    }
}

method 2:
class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        ans[0] = nums[0];
        for(int i =1; i<nums.length; i++){
            ans[i] = ans[i-1] + nums[i];
        }
        return ans;
    }
}
