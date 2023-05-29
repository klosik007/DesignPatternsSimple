package decorator

class Cream(private val drink: Drink): IngredientDecorator() {
    override fun getDesc(): String {
        return drink.getDesc() + ", Bita Śmietana"
    }
    override fun cost(): Double {
        return drink.cost() + 0.50
    }
}