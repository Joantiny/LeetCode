//原始做法，时间超过限制，for循环使用过多
class Solution {
    public int maxProfit(int[] prices) {
           List<Integer> profit =new ArrayList<Integer>();
    int diff=0;
	for(int i=0; i<prices.length-1;i++)
    {
		for(int j=i+1;j<prices.length;j++)
		{
			diff=prices[j]-prices[i];
			if(diff>0)
			{
				profit.add(diff);
			}
		}
	
    }
    int sizeofpro=profit.size();
	
	if(sizeofpro!=0)
	{
		Collections.sort(profit);
		return profit.get(sizeofpro-1);
	}
	else
	{
		return 0;
	}
	
    }
}


//优化算法，即累加相邻两天的利润
class Solution {
    public int maxProfit(int[] prices) {
      int Maxsofar=0;
    int diff=0;
	for(int i=0; i<prices.length-1;i++)
    {
		diff+=prices[i+1]-prices[i];
		diff=Math.max(0, diff);
		Maxsofar=Math.max(diff, Maxsofar);
    }
        return Maxsofar;
    }
}
