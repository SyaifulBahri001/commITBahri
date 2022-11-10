package Test

import java.util.*
fun main() {
    val pilih_kondisi: String
    var nilai_a = 0
    var nilai_b = 0
    val hasil: Double
    val input_pilihan = Scanner(System.`in`)
    println("PILIHAN OPERASI: ")
    println("1. Penjumlahan")
    println("2. Pengurangan")
    println("3. Perkalian")
    println("4. Pembagian")
    println("5. Pemangkatan")
    print("Pilih Operasi : ")
    pilih_kondisi = input_pilihan.next()
    if (pilih_kondisi == "1") {
        println("Masukkan Nilai A: ")
        nilai_a = input_pilihan.nextInt()
        println("Masukkan Nilai B: ")
        nilai_b = input_pilihan.nextInt()
        hasil = (nilai_a + nilai_b).toDouble()
        println("Hasil penjumlahan adalah: $hasil")
    } else if (pilih_kondisi == "2") {
        println("Masukkan Nilai A: ")
        nilai_a = input_pilihan.nextInt()
        println("Masukkan Nilai B: ")
        nilai_b = input_pilihan.nextInt()
        hasil = (nilai_a - nilai_b).toDouble()
        println("Hasil penjumlahan adalah: $hasil")
    } else if (pilih_kondisi == "3") {
        println("Masukkan Nilai A: ")
        nilai_a = input_pilihan.nextInt()
        println("Masukkan Nilai B: ")
        nilai_b = input_pilihan.nextInt()
        hasil = (nilai_a * nilai_b).toDouble()
        println("Hasil penjumlahan adalah: $hasil")
    } else if (pilih_kondisi == "4") {
        println("Masukkan Nilai A: ")
        nilai_a = input_pilihan.nextInt()
        println("Masukkan Nilai B: ")
        nilai_b = input_pilihan.nextInt()
        hasil = (nilai_a / nilai_b).toDouble()
        println("Hasil penjumlahan adalah: $hasil")
    } else if (pilih_kondisi == "5") {
        println("Masukkan Nilai A: ")
        nilai_a = input_pilihan.nextInt()
        println("Masukkan Nilai B: ")
        nilai_b = input_pilihan.nextInt()
        hasil = Math.pow(nilai_a.toDouble(), nilai_b.toDouble())
        println("Hasil penjumlahan adalah: $hasil")
    } else {
        println("Pilihan tidak ada!")
    }
}