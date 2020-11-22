fun main(args: Array<String>) {
val nums: IntArray = intArrayOf(2,3,4,5, 6,9,1,3)

var sortedArray = SortingPlace().selectionSort(nums)
    for(m in sortedArray.indices) {
    println(sortedArray[m])
    }
}

class SortingPlace {
    
    fun selectionSort(preSortedIntArray: IntArray): IntArray {
        var pointer = 0
        
        for (m in 0 until preSortedIntArray.size) {

            for (i in pointer until preSortedIntArray.size) {
            
                if(preSortedIntArray[i] < preSortedIntArray[m]) {
                var placeHolder = preSortedIntArray[i]
                 preSortedIntArray[i] = preSortedIntArray[m]
                 preSortedIntArray[m] = placeHolder
                }
                
            }
        pointer++

        }
        return preSortedIntArray
    }
    
    
}
