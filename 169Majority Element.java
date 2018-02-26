class Solution {
    public int majorityElement(int[] nums) {
    int majority=0;
	Arrays.sort(nums);
	int N=nums.length;
	for(int i=0;i<N;i++)
	{
		if(nums[i+N/2]==nums[i])
		{
			majority=nums[i];
			break;
		}
	}
    return majority;
    }
}
