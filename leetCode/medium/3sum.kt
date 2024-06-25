class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val answers = ArrayList<List<Int>>()
        val sorted = nums.sorted()

        for (i in sorted.indices) {
            //정렬된 숫자가 이전이랑 같은지 확인
            if (i > 0 && sorted[i - 1] == sorted[i]) {
                continue
            }
            var left = i + 1
            var right = sorted.size - 1

            while (left < right) {
                val sum = sorted[i] + sorted[left] + sorted[right]

                if (sum == 0) { //조건에 부합할때

                    answers.add(listOf(sorted[i], sorted[left], sorted[right]))
                    left++
                    right--

                    // left가 이전이랑 같은지 확인 같으면 건너띄기
                    while (left < right && sorted[left] == sorted[left - 1]) {
                        left++
                    }
                    // right가 이전이랑 같은지 확인 같으면 건너띄기
                    while (left < right && sorted[right] == sorted[right + 1]) {
                        right--
                    }
                } else if (sum < 0) { //합이 음수일때
                    left++
                    while (left < right && sorted[left] == sorted[left - 1]) {
                        left++
                    }
                } else { //합이 양수일때
                    right--
                    while (left < right && sorted[right] == sorted[right + 1]) {
                        right--
                    }
                }
            }
        }
        return answers
    }
}