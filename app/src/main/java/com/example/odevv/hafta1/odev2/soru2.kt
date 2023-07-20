package com.example.odev.hafta1.odev2

import java.lang.Exception
import java.util.Scanner

    fun main() {
        val scanner = Scanner(System.`in`)
        print("Lütfen yaşınızı giriniz: ")
        try {
            val age = scanner.nextInt()
            if (age >= 18) {
                println("Oy kullanabilirsiniz.")
            } else {
                println("Oy kullanamassınız.")
            }
        } catch (e: Exception) {
            println("Geçerli bir sayı giriniz.")
        }
    }