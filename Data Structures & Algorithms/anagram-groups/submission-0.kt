class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = mutableMapOf<String, MutableList<String>>()
        for (str in strs) {
            val sorted = String(str.toCharArray().apply { sort() })
            if (sorted in result) {
                result.getValue(sorted).add(str)
            }
            else {
                result[sorted] = mutableListOf<String>(str)
            }
        }
        return result.values.map { it.toList() }
    }
}
