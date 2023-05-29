package decorator

class CoffeeHeavilyRoasted: Drink() {
    init {
        description = "Kawa Mocno Palona"
    }
    override fun cost(): Double = 9.00
}