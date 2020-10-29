import kotlin.math.max

fun main() {
    //buatkan pengkondisian untuk menentukan status nilai akhir apabila nilai akhir diatas 79 maka A
    //jika nilai akhir 79 kebawah B
    //65 kebawah C dan 50 kebawah D
    //dengan variable nilai
    //nilai max 100
    //keyword menggunakan AND(&&)untuk mengunakan kondisi

    val nilai :Int= 79

    //max(nilai=0, nilai=100)
    if (nilai > 79 && nilai<=100){
        println("nilai kamu A")
    }
    else if (nilai >=65 && nilai <= 79){
        println("Nilai Kamu B")
    }
    else if (nilai >=50 && nilai <65){
        println("nilai Kamu C")
    }
    else{
        println("Nilai kamu D")
    }
}
