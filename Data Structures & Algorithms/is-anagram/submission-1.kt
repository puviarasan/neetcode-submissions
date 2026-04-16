class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length)
            return false
        val map = mutableMapOf<Char,Int>()
        val arr1 = s.toCharArray()
        val arr2 = t.toCharArray()
        for(i in arr1){
            if(map.contains(i))
                map[i] = map[i]!!+1
            else
                map[i] = 1
        }
        for(i in arr2){
            if(map.contains(i)){
                if(map[i]==0)
                    return false
                else
                    map[i]=map[i]!!-1
            }
            else
                return false
        }
        map.forEach{(k,v)->
        if(v!=0)
        return false
        }
        return true

    }
}
