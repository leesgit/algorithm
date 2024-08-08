fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
    val result = mutableListOf<IntArray>()
    var start = newInterval[0]
    var end = newInterval[1]
    var added = false

    for (interval in intervals) {
        if (interval[1] < start) {
            // newInterval의 시작 전에 끝나는 interval들은 그냥 추가
            result.add(interval)
        } else if (interval[0] > end) {
            // newInterval의 끝 후에 시작하는 구간에서 newInterval을 통해 수정된 구간이 있으면 추가
            if (!added) {
                // 병합된 newInterval 추가
                result.add(intArrayOf(start, end))
                added = true
            }
            //아니면 그냥 추가
            result.add(interval)
        } else {
            // 겹치는 구간, newInterval의 범위 수정
            start = minOf(start, interval[0])
            end = maxOf(end, interval[1])
        }
    }

    // 마지막에 newInterval을 추가하지 않았을 경우
    if (!added) {
        result.add(intArrayOf(start, end))
    }

    return result.toTypedArray()
}
/*
접근 방식
각 구간의 시작과 끝을 newInterval의 시작점(start)하고 비교하여
newInterval의 시작점이 어떤 구간의 시작점과 끝점 사이에 포함되는 경우,
그 구간을 기록한다. 그 후, newInterval의 끝점(end)을 포함하는 구간을 찾는다.
이러한 구간이 존재하면, newInterval의 시작점과 이 구간의 끝점을 사용하여 새로운 구간을 생성한다.
이 새로운 구간을 기존의 다른 구간들과 합쳐서 반환한다. 만약 newInterval의 끝점을 포함하는 구간이 존재하지 않으면
newInterval의 끝점을 사용하여 새로운 구간을 만들고 이를 기존 구간과 합쳐서 반환한다.
 */
