package obserwator

class WarunkiBiezaceWyswietl(danePogodowe: Podmiot): Obserwator, WyswietlElement {
    private var temp: Float = 0.0f
    private var wilgotnosc: Float = 0.0f

    init{
        danePogodowe.zarejestrujObserwatora(this)
    }

    override fun aktualizacja(temp: Float, wilgotnosc: Float, cisnienie: Float) {
        this.temp = temp
        this.wilgotnosc = wilgotnosc
        wyswietl()
    }

    override fun wyswietl() {
        println("Warunki biezace: $temp st.C, $wilgotnosc % wilgotnosci")
    }
}