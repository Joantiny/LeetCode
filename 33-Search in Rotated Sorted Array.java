// 二分法，Rotated sorted array 的形式都为后半截值较大的序列被放到前面了，如4,5,6,7,0,1,2,3。
//我们需先确认中值m身处一个sorted的半截序列里，还是类似于6,7,0,1,2,3这样正好排序有变化的半段序列里。
//每次的if条件，都选择写m身处sorted的半截序列的条件，因为只有这个情况才能用m、targer、r、l之间的大小关系描述的出来，其他情况都用else表示。
class Solution {
    public int search(int[] nums, int target) {
        int l=0;
		int r=nums.length-1;
		if(nums==null || nums.length==0){
            return -1;
        }
        while(l<=r) {
			int m=(l+r)/2;
			if(target==nums[m]) {
				return m;
			}
			if(nums[m]<=nums[r]) {   //写m身处sorted的半截序列的条件
			    if(nums[m]<target && target<=nums[r]) {   //写m身处sorted的半截序列的条件
				    l=m+1;
			    }else
                {
                    r=m-1;
                }
		    }else
                {
                    if(target<nums[m] && target>=nums[l]){   //写m身处sorted的半截序列的条件
                        r=m-1;    
                    }else{
                        l=m+1;
                    }
                }
        }
        return -1;
    }
}
