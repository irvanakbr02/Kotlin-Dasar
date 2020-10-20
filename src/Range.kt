fun main(){

    val range = 0..1000
    print(range)

    val range1 = 0..100 step 5
    val range2 = 100 downTo 0 step 5
    println(range1.step)
    println(range2.first)
    println(range2.last)
}