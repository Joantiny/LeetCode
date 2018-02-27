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


//leetcode 229: Majority Element II
//观察可知，数组中至多可能会有2个出现次数超过 ⌊ n/3 ⌋ 的众数
//记变量n1, n2为候选众数； c1, c2为它们对应的出现次数
//遍历数组，记当前数字为num
//若num与n1或n2相同，则将其对应的出现次数加1
//否则，若c1或c2为0，则将其置为1，对应的候选众数置为num
//否则，将c1与c2分别减1
//最后，再统计一次候选众数在数组中出现的次数，若满足要求，则返回之。
class Solution {
    public List<Integer> majorityElement(int[] nums) {
    List<Integer> res=new ArrayList<Integer>();
    int c1=0;
    int c2=0;
    int m1=0;
    int m2=0;
    int[] majority=new int[2];
    if(nums.length==0||nums==null)
    {
        return res;
    }
    if(nums.length==1)
    {
        res.add(nums[0]);
        return res;
    }
        
   for(int i=0;i<nums.length;i++)
    {
    	if(nums[i]==m1)
    	{
    		c1++;
    	}
    	if(nums[i]==m2)
    	{
    		c2++;
    	}
    	if(nums[i]!=m1&&nums[i]!=m2)
    	{
    		if(c1==0) {
    			m1=nums[i];
    			c1=1;
    		}else if(c2==0) {
    			m2=nums[i];
    			c2=1;
    		}else {
    		c1--;
    		c2--;
    		}
    	}
    }
    c1=0;
    c2=0;
    for(int i=0;i<nums.length;i++)
    {
    	if(nums[i]==m1)
    	{
    	c1++;	
    	}
    	if(nums[i]==m2)
    	{
    		c2++;
    	}
    }
    if(m1!=m2){
    if(c1>nums.length/3)
    {
        res.add(m1);
    }
    if(c2>nums.length/3)
    {
        res.add(m2);
    }
    }else
    {
        res.add(m1);
        
    }
    return res;
}

        
}
