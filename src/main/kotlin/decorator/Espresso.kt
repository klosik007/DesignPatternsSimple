package decorator

class Espresso: Drink() {
    init {
        description = "Kawa Espresso"
    }

    override fun cost(): Double = 10.00
}