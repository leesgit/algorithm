class MinStack() {
    private val stack = ArrayList<Pair<Int, Int>>()

    //스택을 pop할 때 min의 정보가 사라짐으로 입력될 때마다 해당 입력시에 min값을 같이 기록한다.
    //pair 객체 생성안하고 ArrayList를 하나 더 만들어도 됨
    fun push(`val`: Int) {
        if (stack.isEmpty()) {
            stack.add(Pair(`val`, `val`))
        } else {
            val min = minOf(`val`, stack.last().second)
            stack.add(Pair(`val`, min))
        }
    }

    fun pop() {
        if (stack.isNotEmpty()) {
            stack.removeAt(stack.lastIndex)
        }
    }

    fun top(): Int {
        return stack.last().first
    }

    fun getMin(): Int {
        return stack.last().second
    }
}