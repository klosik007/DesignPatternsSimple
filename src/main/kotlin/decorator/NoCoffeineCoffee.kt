package decorator

class NoCoffeineCoffee: Drink() {
    init {
        description = "Kawa bez kofeiny"
    }
    override fun cost(): Double = 15.00
}