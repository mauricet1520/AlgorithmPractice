fun main(args: Array<String>) {
val nums: IntArray = intArrayOf(2,3,4,5, 6,9,1,3)
    var sortedArray = SortingPlace().bubbleSort(nums)
    for(m in sortedArray.indices) {
    println(sortedArray[m])
    }

}

class SortingPlace {
    fun bubbleSort(v: IntArray):IntArray {
        
        var pointer = v.size

        for(m in 0 until pointer) {
        
            for(n in 0 until v.size) {
                if(v.size > n + 1) {
                    if (v[n] > v[n + 1] ) {
                    var placeHolder = v[n + 1]
                    v[n + 1] = v[n]
                    v[n] = placeHolder
                    }
                }
                
            }
        pointer--
        }
        return v
    }
}
