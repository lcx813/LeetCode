/*
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

*/

/*
1.Brute force O(n^2)
2.Hash Table O(n)
*/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        
        for(int j=0;j<nums.length;j++)
        {
            int y=nums[j];

	//compare value in HashTable and index in array
            if(map.containsKey(target-y) && j!=map.get(target-y))
                return new int[] {j+1,map.get(target-y)+1};
        }
    throw new IllegalArgumentException("No two sum solution");        
        
        
    }
}