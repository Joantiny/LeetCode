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

// 双指针定位
public void moveZeroes(int[] nums) {
    int leftMostZeroIndex = 0; // The index of the leftmost zero
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            if (i > leftMostZeroIndex) { // There are zero(s) on the left side of the current non-zero number, swap!
                nums[leftMostZeroIndex] = nums[i];
                nums[i] = 0;
            }

            leftMostZeroIndex++;//非0的元素双指针同时+1，当元素为0时，ZeroIndex指针不增长，i增长。
        }
    }
}
