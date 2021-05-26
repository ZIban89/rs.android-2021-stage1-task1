package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sum = bill.sum()
        val annBill = (sum - bill[k]) / 2
        return if (b > annBill) (b - annBill).toString() else "Bon Appetit"
    }
}
