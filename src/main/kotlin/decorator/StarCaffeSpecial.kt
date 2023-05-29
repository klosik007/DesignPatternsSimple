package decorator

class StarCaffeSpecial: Drink() {
    init {
        description = "Star Caffe Special"
    }
    override fun cost(): Double = 50.00
}