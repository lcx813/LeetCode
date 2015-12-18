import java.util.HashMap;

public class TwoSum {
	public HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	public void add(int input)
	{
		
		//hash function????
		if(map.containsKey(input))
			map.put(input, map.get(input)+1);
		else
			map.put(input, 1);
		
	}
	public boolean  find(int target)
	{
		//HashMap.keySet()--traverse
		for(Integer i: map.keySet())
		{
			
			int y=target-i;
			if(map.containsKey(y) && y!=i)
				return true;
			//aviod same key????
			else if(map.containsKey(y) && y==i)
			{
				if(map.get(y)<2)
					return false;
				else 
					return true;
			}
		}
		return false;
	}
	
	
	
}
