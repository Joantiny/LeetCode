class Solution {
  public int[] twoSum(int[] nums, int target) {
  int N=nums.length;
	int[] indices=new int[2];
	int[] nums_sort=new int[N];
	for(int i=0;i<N;i++)
	{
		nums_sort[i]=nums[i];
	}
	Arrays.sort(nums);
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1; j<nums.length;j++)
			{
				if(nums[i]+nums[j]>target)
				break;
				if(nums[i]+nums[j]==target) 
				{
					indices[0]=i;
					indices[1]=j;
				}	
			}
				
		}
		for(int i=0;i<N;i++)
		{
			if(nums_sort[i]== nums[indices[0]])
				{
				indices[0]=i;
			    break;
				}
			
		}
		for(int j=0;j<N;j++)
		{
            if(j==indices[0])
			{
			 continue;
			}
			if(nums_sort[j]==nums[indices[1]])
				{
				indices[1]=j;
				break;
				}
		}
    
        return indices;
    }
}


//HashMap
class Solution {
    public int[] twoSum(int[] nums, int target) {
    int N=nums.length;
	int[] indices=new int[2];
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    for(int i=0;i<N;i++)
    {
        map.put(nums[i],i);
    }
    for(int i=0;i<N;i++)
    {
        int t=target-nums[i];
        if(map.containsKey(t) && map.get(t)!=i)
        {
            indices[0]=i;
            indices[1]=map.get(t);
            break;
        }
    }
        
        return indices;
    }
}
