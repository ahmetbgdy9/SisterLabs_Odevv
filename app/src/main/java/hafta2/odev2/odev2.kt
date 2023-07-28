package hafta2.odev2

// Bir "Oyuncu" adlı üst sınıf oluşturun. Ardından "Futbolcu" ve "Basketbolcu" adında
// iki alt sınıf oluşturun. Her bir alt sınıfın kendine özgü özellikleri ve işlevleri olsun.
// Oyuncuların "oyna" işlevi olmalı.

fun main() {

    var futbolcu1 = Futbolcu(12,"forvet")
    var futbolcu2 = Futbolcu(2,"ortasaha")
    var futbolcu3 = Futbolcu(7,"defans")

    var basketbolcu1 = Basketbolcu(20,"fenerbahce")
    var basketbolcu2 = Basketbolcu(59,"galatasaray")
    var basketbolcu3 = Basketbolcu(120,"beşiktaş")

    futbolcu1.oyna()
    futbolcu2.oyna()
    futbolcu3.oyna()
    println("*************************************")
    basketbolcu1.oyna()
    basketbolcu2.oyna()
    basketbolcu3.oyna()
}

open class Oyuncu(var ad:String,var soyad:String,var yas:Int) {

}

class Futbolcu(var formaNo:Int, var mevki:String) : Oyuncu("ali","kılınç",21) {

    fun oyna() {
        if (mevki == "forvet") {
            println("gerideyken oyuna gir")
        }
        else if(mevki == "defans") {
            println("öndeyken oyuna gir")
        }
        else {
            println("girme")
        }
    }
}

class Basketbolcu(var hiz:Int, var takim:String) : Oyuncu("ferhat","sensoy",22) {

    fun oyna() {
        if (hiz >= 80) {
            println("oyuna gir")
        }
        else if (hiz <= 60){
            println("kadro dışı")
        }
        else {
            println("oyuna girme")
        }
    }
}