package hafta2.odev5

//Bir "Kullanici" adlı sınıf oluşturun ve ad ve soyad gibi özellikleri içeren nullable özellikler
// tanımlayın. Kullanıcı adı ve soyadı null olabileceğini göz önünde bulundurarak
// bu özelliklere nasıl erişebilirsiniz?

class Kullanici(val ad: String?, val soyad: String?) {

}

fun main() {
    val kullanici = Kullanici("Ahmet", null)
    println("Ad: ${kullanici.ad ?: "Bilgi yok"}")
    println("Soyad: ${kullanici.soyad ?: "Bilgi yok"}") // Eğer soyad null ise "Bilgi yok" yazdırır
}