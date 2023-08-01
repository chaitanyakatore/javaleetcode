//https://leetcode.com/problems/kth-largest-element-in-an-array/description/
//using priority Queue
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        for(int i = 0 ; i < k ; i++){
            ans.add(nums[i]);
        }
        for(int j = k ; j < nums.length ; j++){
            if(ans.peek() < nums[j]){
                ans.poll();
                ans.add(nums[j]);
            }
        }
        return ans.peek();
    }
    
}
