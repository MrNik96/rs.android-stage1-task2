package subtask6

class Fibonacci {

    fun productFibonacciSequenceFor(n: Int): IntArray {
        var firstFib = 0
        var secondFib = 1
        while(firstFib * secondFib <= n){
            if (firstFib*secondFib == n) return intArrayOf(firstFib,secondFib,1)
            secondFib += firstFib
            firstFib = secondFib - firstFib
        }
        return intArrayOf(firstFib,secondFib,1)
    }
}
