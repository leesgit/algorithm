import java.math.BigInteger

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

//문제의 의도는 기존의 두 연결 리스트를 값을 순서 대로 더해 만들어진 새로운 연결 리스트를 반환하는거지만
//전부 문자열로 받은 다음에 BigInteger를 통해 합을 계산한 후 이를 통해 연결 리스트를 만들어 반환하는 식으로 작업 했다.
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var num1 = ""
    var num2 = ""
    var currentNode1 = l1
    var currentNode2 = l2

    //문자열로 변환
    while (currentNode1 != null) {
        num1 = currentNode1.`val`.toString() + num1
        currentNode1 = currentNode1.next
    }

    while (currentNode2 != null) {
        num2 = currentNode2.`val`.toString() + num2
        currentNode2 = currentNode2.next
    }

    //변환된 문자열을 BigInteger를 통해 더한다.
    val sum = (BigInteger(num1) + BigInteger(num2)).toString()

    val dummyHead = ListNode(0)
    var current = dummyHead

    // 결과값을 연결 리스트로 변환
    for (char in sum.reversed()) {
        current.next = ListNode(char - '0')
        current = current.next!!
    }

    // 결과 연결 리스트의 첫 번째 노드 반환
    return dummyHead.next
}
