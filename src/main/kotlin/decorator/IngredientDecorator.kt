package decorator

abstract class IngredientDecorator: Drink() {
    abstract override fun getDesc(): String
}