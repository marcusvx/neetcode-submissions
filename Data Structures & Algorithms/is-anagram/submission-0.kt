class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.count() != t.count()){
            return false
        }

        val sMap = mutableMapOf<Char, Int>()
        val tMap = mutableMapOf<Char, Int>()

        s.forEachIndexed { index, c ->
            sMap[s[index]] = sMap.getOrElse(s[index]) { 0 } + 1
            tMap[t[index]] = tMap.getOrElse(t[index]) { 0 } + 1
        }

        for ((k, v) in sMap) {
            if (tMap[k] != v) {
                return false
            }
        }
        return true
    }
}
