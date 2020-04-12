package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val aSet = a.toUpperCase().toList()
        val bSet = b.toList()

        val iSet =  aSet.intersect(bSet).toList()
        return if(iSet == bSet) "YES" else "NO"
    }
}
