import java.util.*

fun main() {
    //Soal1

    //urutkan index aray dari yang terkecil sampaii yang terbesar (ASSCENDING)
    //DAN
    //Ururtakn dari yg terbesar ke yang terkecil
    //key word looping 2 kali tpi 1 array output text biasa

    val arrayku = arrayOf(70,77,7,17,-77)
    println("Array Sebelum di ubah : ${Arrays.toString(arrayku)}")

    val sortedArray = arrayku.sortedArray()
    println("Urut dari yang terkecil ke yang terbesar : ${Arrays.toString(sortedArray)}")

    val DescendingArray = arrayku.sortedArrayDescending()
    println("Urut dari yang terbesar ke yang terkecil: ${Arrays.toString(DescendingArray)}")

    // CARA LAIN
    //    arrayku.sortDescending()
    //    arrayku.forEach { println(it) }
    // Sumber : https://www.codevscolor.com/6-ways-sort-array-kotlin

}