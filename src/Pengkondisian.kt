fun main(){
    // IF ELSE Interger
    val nilai = 10
    if(nilai > 80){
        println("Seeelamat nilai anda "+nilai)
    }

    else{
        println("COBA LAGI NANTI ")
    }

    // NYOBA ELSE IF string
    val nama = "IRPA"
    if(nama == "IRPAN"){
        println("ANDA ADALAH "+nama+" GAMING" )
    }
    else{

        println("Anda bukan "+nama+" Gaming")
    }

    // NYOBA ELSE IF
    val nilai1 = 10
    if(nilai1 <= 5){
        println("nilai anda kurang dari 5 ") // jika nilai anda kurang dari 5
    }
    else if (nilai1 >=10){
        println("nilai anda lebih dari 15") // jika nilai anda lebih dari 15
    }
    else if(nilai1 == 10){
        println("nilai anda sama dengan 10") // jika nilai anda sama dengan nilai1
    }
    else{
        println("nilai anda sih apa") // jika nilai anda tidak kurang dari 10,lebih dari 15,nilai tidak sama dengan nilai1
    }

    val nilai2 = 80
    if(nilai2 >= 80){
        println("Nilai A MANTUL")
    }
        else if(nilai2>=50){
            println("Nilai C NJENG")
        }
        else{
        println("See U next Time bitch")
    }


    // Pengkondisian 'WHEN'
    val nilai3='B'
    when(nilai3){
        'A'-> println("Anjeng")
        'B'-> println("Babi")
        'C'-> println("Contol")
        'D'-> println("Dolop")
        else-> println("SLAH SEMUA BLOG")
    }

}