package com.example.odev.hafta1.odev1

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val varsayilanKadi = "Ahmet"
    val varsayilanSifre = "Ahmet1234"



    print("Kullanıcı adını giriniz : ")
    val kullaniciAdi = scanner.next()

    print("Şifreinizi Giriniz : ")
    val sifre = scanner.next()

    if (kullaniciAdi.equals(varsayilanKadi, ignoreCase = true ) && sifre == varsayilanSifre) {

        println("hosgeldiniz")
    }
    else {
        println("Kullanıcı adı veya şifre hatalı!")
    }
}
