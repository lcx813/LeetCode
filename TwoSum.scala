object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        val indices_value_map = collection.mutable.Map[Int, Int]()
        
        for ( (x, i) <- nums.zipWithIndex){
            indices_value_map.put(x, i)
        }
        
        for ( (x, i) <- nums.zipWithIndex){
            val new_target = target - x
            if (indices_value_map.exists(_._1 == new_target) && (i != indices_value_map(new_target)))
                return Array(i, indices_value_map(new_target))      
        }
        return Array(-1)        
    }
}