import obserwator.Obserwator
import obserwator.Podmiot

class DanePogodowe() : Podmiot {
    private var obserwatorzy = arrayListOf<Obserwator>()
    private var temp: Float = 0.0f
    private var wilgotnosc: Float = 0.0f
    private var cisnienie: Float = 0.0f

    fun odczytZmiana(){
        powiadomObserwatorow()
//        val temp: Float = pobierzTemperature()
//        val wilgotnosc: Float = pobierzWilgotnosc()
//        val cisnienie = pobierzCisnienie()
//
//        warunkiBiezaceWyswietl.aktualizacja(temp, wilgotnosc, cisnienie)
//        statystykaWyswietl.aktualizacja(temp, wilgotnosc, cisnienie)
//        prognozaWyswietl.aktualizacja(temp, wilgotnosc, cisnienie)
    }

    fun ustawOdczyty(temp: Float, wilgotnosc: Float, cisnienie: Float){
        this.temp = temp
        this.wilgotnosc = wilgotnosc
        this.cisnienie = cisnienie
        odczytZmiana()
    }

    override fun zarejestrujObserwatora(obserwator: Obserwator) {
        obserwatorzy.add(obserwator)
    }

    override fun usunObserwatora(obserwator: Obserwator) {
        val index = obserwatorzy.indexOf(obserwator)
        if (index >= 0) {
            obserwatorzy.removeAt(index)
        }
    }

    override fun powiadomObserwatorow() {
        for(i in 0 until obserwatorzy.size){
            val obs: Obserwator = obserwatorzy[i]
            obs.aktualizacja(temp, wilgotnosc, cisnienie)
        }
    }
}