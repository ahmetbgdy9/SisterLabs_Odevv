package hafta3.odev5

class birinciThread:Thread() {
    override fun run() {
        for (i in 1..20) {
            println("birinci thread değeri: $i")
            sleep(5000)
        }
    }
}
