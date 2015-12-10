/*
Similar to Question [1. Two Sum], except that the input array is already sorted in ascending order.
*/

/*
we could still apply the [Hash table] approach, but it costs us O(n) extra space, plus it does not make use of the fact that the input is already sorted.

O(n log n) runtime, O(1) space – Binary search:For each element x, we could look up if target – x exists in O(log n) time by applyingbinary search over the sorted array. Total runtime complexity is O(n log n).
*/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
    	for(int i=0;i<nums.length;i++)
    	{
    		int x=nums[i];
    		int j=BSearch(nums,target-x, i+1);
    		if(i!=j)
    			return new int[] {i+1,j+1};
    	}
    	
    	 throw new IllegalArgumentException("Not Found");    
    
        
    }
    public int BSearch(int[] num, int t, int start)
    {	
    	int L=start;
    	int R=num.length-1;
    	while(L<R)
    	{
    		int mid=(L+R)/2;
    		if(num[mid]<t)
    			L=mid+1;
    		else
    			R=mid;
    	}
    	return (L==R && num[L]==t) ? L:-1;
    	
    }
}