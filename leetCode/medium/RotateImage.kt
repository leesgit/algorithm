fun rotate(matrix: Array<IntArray>): Unit {
    val n = matrix.size

    // nxn 행렬을 90도 회전시키는 방법은 보통 행과 열을 바꾼 다음에 행들이 가진 배열들을 역순으로 배치하면 90도 회전이 된다.
    for (i in 0 until n) {
        for (j in i until n) {
            //행과 열 바꾸기
            val temp = matrix[i][j]
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = temp
        }
    }

    // 배열을 역순으로 정렬
    for (row in matrix) {
        row.reverse()
    }
}