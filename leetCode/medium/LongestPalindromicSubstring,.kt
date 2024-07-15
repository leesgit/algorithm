class Solution {
    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) return ""

        var start = 0
        var end = 0
        var maxLength = Integer.MIN_VALUE
        for (i in s.indices) {
            //홀수 짝수 팰린드롬을 확인
            val oddLength = findPalindromeLength(s, i, i)
            val evenLength = findPalindromeLength(s, i, i + 1)
            val length = maxOf(oddLength, evenLength)

            //기존 maxLength 보다 새로 탐색한 length의 길이가 크다면 새로운 start와 end를 설정한다
            if (length > maxLength) {
                maxLength = length
                start = i - (length - 1) / 2
                end = i + length / 2
            }
        }

        return s.substring(start, end + 1)
    }

    private fun findPalindromeLength(s: String, left: Int, right: Int): Int {
        var leftIndex = left
        var rightIndex = right
        //좌우로 같은지 조건을 확인 하면서 길이를 검사한다
        while (leftIndex >= 0 && rightIndex < s.length && s[leftIndex] == s[rightIndex]) {
            leftIndex--
            rightIndex++
        }
        return rightIndex - leftIndex - 1
    }
}