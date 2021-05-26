package obserwator

interface Obserwator {
    fun aktualizacja(temp: Float, wilgotnosc: Float, cisnienie: Float)
}