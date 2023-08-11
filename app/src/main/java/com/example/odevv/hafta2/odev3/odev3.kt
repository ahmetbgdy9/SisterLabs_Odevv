package com.example.odevv.hafta2.odev3

//Bir "Personel" adlı sınıf oluşturun ve şirketteki personellerin özelliklerini
// (ad, soyad, pozisyon, maaş vb.) içeren nitelikleri ve "maasArttir" gibi işlevi ekleyin.

fun main() {


    val personel1 = Personel("ahmet","buğday","junior",20.000)
  /*  val personel2 = Personel("ali","eren","mid",30.000)
    val personel3 = Personel("yusuf","kara","senior",40.000)*/

    personel1.bilgileriYazdir()
    personel1.maasArttir(0.20)
    println("******************************************")
    personel1.bilgileriYazdir()

}

open class Personel(var ad:String, var soyad:String, var pozisyon:String, var maas:Double) {


    fun bilgileriYazdir() {
        println("Adı: $ad")
        println("Soyadı: $soyad")
        println("Pozisyonu: $pozisyon")
        println("Maaşı: $maas")
    }

    fun maasArttir(oran: Double) {
        maas += maas * oran
    }


}