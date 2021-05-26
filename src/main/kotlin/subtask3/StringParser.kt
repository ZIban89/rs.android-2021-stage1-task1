package subtask3


class StringParser {


    fun getResult(inputString: String): Array<String> {
        val signsMap = mapOf('<' to '>', '(' to ')', '[' to ']')
        val resultList = mutableListOf<String>()
        for (i in inputString.indices) {
            if (inputString[i] in signsMap.keys) {
                var count = 1
                val openBracket = inputString[i]
                for (j in i + 1..inputString.lastIndex) {
                    if (inputString[j] == openBracket) {
                        count++
                    }
                    if (inputString[j] == signsMap[openBracket]) {
                        count--
                        if (count == 0) {
                            resultList.add(inputString.substring(i + 1, j))
                            break
                        }
                    }

                }

            }

        }

        return resultList.toTypedArray()
    }
}

