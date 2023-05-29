package decorator

class Milk(private val drink: Drink): IngredientDecorator() {
    override fun getDesc(): String = drink.getDesc() + ", Mleko"

    override fun cost(): Double = drink.cost() + 0.70
}