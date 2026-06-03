class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val numsMap = mutableSetOf<Int>()
        for (num in nums) {
            if (num in numsMap) {
                return true
            }

            numsMap.add(num)
        }

        return false
    }
}
