package percabangan_dan_perulangan
//// Pemilihan Niali Ganjil
//fun main(){
//    for (i in 1 .. 10){
//        if (i % 2 == 1){
//            print(i)
//        }
//    }
//}

//// Pemilihan Niali Genap
//fun Test.main(){
//    for (i in 1 .. 10){
//        if (i % 2 == 0){
//            print(i)
//        }
//    }
//}

////memanggil nama hewan dari belakang
//fun Test.main(){
//    var hewan = arrayOf("kambing", "sapi", "kucing")
//    for (i in 2 downTo 0) {
//        println(hewan[i])
//    }
//}

////memanggil Angka Dari Satu - 100
//fun Test.main(){
//    for (i in 1..100){
//        println(i)
//    }
//}

////Pemilihan Ganjil or Genap
//fun Test.main(){
//    val nilai = 3
//    if (nilai %2 ==0){
//        println("genap")
//    }else{
//        println("ganjil")
//    }
//}

////menjalankan angka dari 1-11
//fun main(){
//    var i = 0
//    while (i <= 10){
//        i++
//        print(i)
//    }
//}

////perulangan While
//fun main(){
//    var i = 5
//    while (i >= 1){
//        print(i)
//        i++
//    }
//}

/**
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 4
 */

//fun main(){
//    for (i in 1 .. 5){
//        for ( j in 1 .. i ){
//            print("$j")
//    }
//        println()
//    }
//}

/**
 * buatlah Array nilai 1-10
 * selanjutnya buatlah for untuk menampilkan nilai array tersebut
 * selanjutnya jumlah satu satu nilai array nya contoh = 1+2+3+4+5+6+7+8+9+10
 * total = 0
 *
 * ===== total = hasil dari pertmbahan
 *
 * total + total = i
 *
 *
 * ============ tugas rumah =========
 * A. 1 2 3 4 5
 *    1 2 3 4
 *    1 2 3
 *    1 2
 *    1
 *
 * B.
 */

//fun main () {
//    val numArr = intArrayOf(1,2,3,4,5,6,7,8,9,10)
//    for (i in numArr){
//        print(i)
//    }
//}

fun main(){
    for (i in 5 downTo 1){
        for ( j in 1 .. i ){
            print("$j")
    }
        println()
    }

}




