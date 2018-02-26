class Solution {
    public void moveZeroes(int[] nums) {
    int N=nums.length;
	int count=0;
	for(int i=0;i<N;i++)
	{
		if(nums[i]!=0)
		{
			count++;
		}
	}
	int[] m=new int[count];
	int c=0;
	for(int i=0;i<N;i++)
	{
		if(nums[i]!=0)
		{
			m[c]=nums[i];
			c++;
		}
	}
	int[] res=new int[N];
	for(int i=0;i<count;i++)
	{
		res[i]=m[i];
		
	}
	for(int i=count;i<N;i++)
	{
		res[i]=0;
	}
    for(int i=0;i<N;i++)
    {
        nums[i]=res[i];
    }
    }
}
