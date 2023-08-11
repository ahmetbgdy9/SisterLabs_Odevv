package com.example.odevv.hafta3.odev5

/*
    * Asenkron olarak uzun süren bir işlemi gerçekleştiren thread oluşturuyoruz.
    * Bu kodda, iki farklı thread oluşturacağız ve her biri uzun süreli bir işlemi temsil edecek.
    * İlk thread 5 saniye uyuyacak, ikinci thread ise 3 saniye uyuyacak.
    * Ana thread, diğer threadler çalışırken devam edecek ve tüm threadlerin bitmesini beklemek için 6 saniye uyuyacak.
    * Bu şekilde, asenkron olarak uzun süren işlemler gerçekleştirsin
    * */

fun main() {
    val thread1 = birinciThread()
    thread1.start()

    val thread2 = Thread(ikinciThread())
    thread2.start()

    for (i in 61..80) {
        println("ana thread i değeri: $i")
        Thread.sleep(6000)
    }
}