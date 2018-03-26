//典型的二分法，循环中每次比较target与数组中值mid后，都需要缩小数组范围，改变下界l或上界r；
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums==null){
            return 0;
        }
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(target<nums[mid]){
                r=mid-1;        
            }
            if(target>nums[mid]){
                l=mid+1;
            }
        }
        return l;
    }
}
