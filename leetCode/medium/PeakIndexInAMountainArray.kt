
fun peakIndexInMountainArray(arr: IntArray): Int {

    var answer = 0
    for (i in 1 until  arr.size - 1) {
        if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
            answer = i
            break
        }
    }
    return answer
}