

fun canJump(nums: IntArray): Boolean {
    var maxDistance = 0
    //탐색하는동안 갈 수 있는 최대 거리
    for (i in nums.indices) {
        if (i > maxDistance) {
            //최대거리를 넘으면 탐색이 안되니까 false
            return false
        }
        maxDistance = maxOf(maxDistance, i + nums[i])
    }
    return true
}