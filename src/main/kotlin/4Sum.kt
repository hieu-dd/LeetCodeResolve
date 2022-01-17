//https://leetcode.com/problems/4sum/submissions/

fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    val hashSet = hashMapOf<Int, Int>()
    nums.forEach {
        hashSet[it] = hashSet.getOrDefault(it, 0) + 1
    }
    val result = mutableListOf<List<Int>>()
    val keys = hashSet.keys.toList().sorted()
    keys.forEachIndexed { index, value ->
        val quantity = hashSet[value]!!
        if (quantity >= 4) {
            if (value * 4 == target) {
                result.add(listOf(value, value, value, value))
            }
        }
        if (quantity >= 3) {
            val valueFind = target - value * 3
            if (valueFind != value && hashSet.getOrDefault(valueFind, 0) > 0) {
                result.add(listOf(value, value, value, valueFind))
            }
        }
        if (quantity >= 2 && target % 2 == 0) {
            val valueFind = (target - value * 2) / 2
            if (valueFind > value && hashSet.getOrDefault(valueFind, 0) > 1) {
                result.add(listOf(value, value, valueFind, valueFind))
            }
        }
        if (quantity >= 2) {
            var j = index + 1
            while (j <= keys.size - 1) {
                val valueFind = target - value * 2 - keys[j]
                if ((valueFind < value || valueFind > keys[j]) && hashSet.getOrDefault(valueFind, 0) > 0) {
                    result.add(listOf(value, value, keys[j], valueFind))
                }
                j++
            }
        }

        if (quantity >= 1) {
            var j = index + 1


            while (j < keys.size - 1) {

                val valueFind2 = (target - value - keys[j])
                if (valueFind2 % 2 == 0 && valueFind2 / 2 > keys[j] && hashSet.getOrDefault(valueFind2 / 2, 0) > 1) {
                    result.add(listOf(value, keys[j], valueFind2 / 2, valueFind2 / 2))
                }

                var k = j + 1
                while (k < keys.size - 1) {
                    val valueFind = target - value - keys[j] - keys[k]
                    if (valueFind > keys[k] && hashSet.getOrDefault(valueFind, 0) > 0) {
                        result.add(listOf(value, keys[j], keys[k], valueFind))
                    }
                    k++
                }
                j++
            }
        }
    }
    return result
}

fun main() {
    print(
        fourSum(
            intArrayOf(
                5, -2, -2, 5, 0, 0, -1, 2
            ),
            8
        )
    )
}