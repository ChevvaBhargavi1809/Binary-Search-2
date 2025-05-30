//Time Complexity: O(logn)
//Space Complexity: O(1)
//Approach: minimum element in rotated sorted array is the pivot element. And it is always in the unsorted half of array. SO using binary search, at each iteration we can reject the sorted half and search for min in the unsorted half
class Solution {
    public int findMin(int[] nums) {
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[low]<=nums[high]){
                return nums[low];
            }
            if((mid==0 || nums[mid]<nums[mid-1]) && (mid==nums.length-1 || nums[mid]<nums[mid+1])){
                return nums[mid];
            }
            else if(nums[low]<=nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}