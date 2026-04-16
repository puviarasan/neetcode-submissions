class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val map = mutableMapOf<Int,Int>()
        nums.forEach{it->
            if(map.contains(it))
                return true
            else
                map[it] = 0
        }
        return false
    }
}
