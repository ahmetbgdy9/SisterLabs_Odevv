package com.example.odevv.hafta3.odev5

class ikinciThread: Runnable {
    override fun run() {
        for (i in 21..60) {
            println("ikinci thread i değeri: $i")
            Thread.sleep(3000)
        }
    }
}