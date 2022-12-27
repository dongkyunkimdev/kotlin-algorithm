class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val resultList = mutableListOf<Int>()
        val validArray = Array(matrix.size) { IntArray(matrix[0].size) }
        var i = 0
        var j = 0
        var way = 0
        while (resultList.size < matrix.size * matrix[i].size) {
            if (validArray[i][j] == 0) resultList.add(matrix[i][j])
            validArray[i][j] = 1
            when (way % 4) {
                0 -> {
                    if (j + 1 < matrix[0].size && validArray[i][j + 1] == 0) {
                        j++
                    } else {
                        way++
                    }
                }

                1 -> {
                    if (i + 1 < matrix.size && validArray[i + 1][j] == 0) {
                        i++
                    } else {
                        way++
                    }
                }

                2 -> {
                    if (j - 1 >= 0 && validArray[i][j - 1] == 0) {
                        j--
                    } else {
                        way++
                    }
                }

                3 -> {
                    if (i - 1 >= 0 && validArray[i - 1][j] == 0) {
                        i--
                    } else {
                        way++
                    }
                }
            }
        }

        return resultList
    }
}