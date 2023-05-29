package decorator

class Chocolate(private val drink: Drink): IngredientDecorator() {
    override fun getDesc(): String {
        return drink.getDesc() + ", Czekolada"
    }

    override fun cost(): Double {
        return drink.cost() + 0.99
    }

}