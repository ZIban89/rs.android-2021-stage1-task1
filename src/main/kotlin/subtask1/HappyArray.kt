package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.size <= 2) return sadArray
        val tempArr = IntArray(sadArray.size)
        var count = 1
        tempArr[0] = sadArray[0]
        for (i in 1..sadArray.lastIndex - 1) {
            if (sadArray[i] < sadArray[i - 1] + sadArray[i + 1]) {
                tempArr[count] = sadArray[i]
                count++
            }
        }
        tempArr[count] = sadArray[sadArray.lastIndex]
        val result = tempArr.copyOfRange(0, count + 1)
        if (result.size == sadArray.size) return result
        else return convertToHappy(result)
    }
}
