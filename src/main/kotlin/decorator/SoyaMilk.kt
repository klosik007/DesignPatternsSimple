package decorator

class SoyaMilk(private val drink: Drink): IngredientDecorator() {
    override fun getDesc(): String = drink.getDesc() + ", Mleko Sojowe"

    override fun cost(): Double {
        return when (drink.getQuantity()) {
            "small" -> drink.cost() + 2.50
            "medium" -> drink.cost() + 3.00
            "large" -> drink.cost() + 4.00
            else -> drink.cost()
        }
    }
}