class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val result = IntArray(k)
        val mapCount = mutableMapOf<Int, Int>()
        for (num in nums) {
            mapCount[num] = if (num in mapCount) mapCount.getValue(num) + 1 else 1
        }

        val topK = mapCount.entries.sortedByDescending { it.value }.map { it.key }.take(k)
        return topK.toIntArray()
    }
}
