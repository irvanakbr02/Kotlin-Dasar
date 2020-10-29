fun sorting (){
    val arrayku = arrayOf(77,70,17,7,-77)
    var temp=0

    for (i in 0..arrayku.size){
        for (j in 1..arrayku.size-1){
            if(arrayku[j-1]>arrayku[j]){

                temp=arrayku[j-1]
                arrayku[j-1]=arrayku[j]
                arrayku[j]=temp
            }
        }
    }
    println(arrayku.toList())
}
fun sorting2(){
    val arrayku = arrayOf(77,70,17,7,-77)
    var temp=0


    for (i in 0..arrayku.size) {
        for (j in 1..arrayku.size - 1) {
            if (arrayku[j - 1] < arrayku[j]) {

                temp=arrayku[j-1]
                arrayku[j-1]=arrayku[j]
                arrayku[j]=temp
            }
        }
    }
    println(arrayku.toList())
}
fun main() {
//    val arrayku = arrayOf(70,77,7,17,-77)
//    for (item in arrayku.sortedArray())
//        println (item)
//
//    println("=======================")
//
//    for (item in arrayku.sortedArrayDescending())
//        println(item)

    sorting()
    sorting2()
}