class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numsMap = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, num -> 
            val diff = target - num
            if (diff in numsMap) {
                return intArrayOf(numsMap.getValue(diff), index)
            }

            numsMap[num] = index
        }
        return intArrayOf()
    }
}
