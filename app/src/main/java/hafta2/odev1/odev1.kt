package hafta2.odev1

//1. Bir "GeometrikSekil" adlı üst sınıf oluşturun. Ardından "Dikdortgen" ve "Daire"
// adında iki alt sınıf oluşturun. Her alt sınıfın kendine özgü alan ve çevre hesaplayan
// işlevleri olsun. (Dikdörtgen alan = uzunluk x genişlik, çevre = 2 x (uzunluk + genişlik),
// Daire alan = π x yarıçap x yarıçap, çevre = 2 x π x yarıçap) Not: ortak kullanılanlar
// GeometrikSeklin özelliği olacak

fun main() {
    var diktortgen = Diktortgen(5,10) // 50,30
    var daire = Daire(3.0,5) //75 ,  30

    println("diktortgen Alan = " + diktortgen.alanHesapla())
    println("diktortgen Çevre = " + diktortgen.cevreHesapla())

    println("Daire Alan = "+ daire.alanHesapla())
    println("Daire Çevre = "+ daire.cevreHesapla())


}

open class GeometrikSekil() {

}

class Diktortgen(var kKenar: Int, var uKenar: Int) : GeometrikSekil(){

    fun alanHesapla():Int {
        return uKenar * kKenar
    }

    fun cevreHesapla(): Int {
        return 2 * (uKenar + kKenar)
    }
}

class Daire(var pi: Double,var yariCap: Int): GeometrikSekil() {

    fun alanHesapla():Double {
        return pi * yariCap * yariCap
    }

    fun cevreHesapla(): Double {
        return 2 * pi * yariCap
    }

}

