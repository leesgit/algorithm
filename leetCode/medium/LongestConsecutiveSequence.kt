fun longestConsecutive(nums: IntArray): Int {
    if (nums.isEmpty()) {
        return 0
    }
    //빅오n이기 때문에 정렬이나 탐색으로 안되고 hash를 이용해야 한다
    val numSet = nums.toHashSet()
    var longestConsecutive = 1

    //hashSet을 이용해 중복을 제거 하고 연속되지 않은 수를 시작으로 연속된 최대길이를 찾는다.
    numSet.forEach {
        //연속 되지 않은 숫자인지 확인
        if (!numSet.contains(it - 1)) {
            var currentNum = it
            var currentConsecutive = 1
            //연속된 길이를 확인
            while (numSet.contains(currentNum + 1)) {
                currentNum += 1
                currentConsecutive += 1
            }
            //연속된 길이와 longestConsecutive 비교
            longestConsecutive = maxOf(longestConsecutive, currentConsecutive)
        }
    }
    return longestConsecutive
}
