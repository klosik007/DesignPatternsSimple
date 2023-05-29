package decorator

fun main(args: Array<String>) {
    val drink = Espresso()
    println("${drink.description} ${drink.cost()}")

    var starCaffeSpecial: Drink = StarCaffeSpecial()
    starCaffeSpecial = Chocolate(starCaffeSpecial)
    starCaffeSpecial = Chocolate(starCaffeSpecial)
    starCaffeSpecial = Cream(starCaffeSpecial)
    println("${starCaffeSpecial.getDesc()} ${starCaffeSpecial.cost()}")

    var noCoffeineCoffee: Drink = NoCoffeineCoffee()
    noCoffeineCoffee.setQuantity("large")
    noCoffeineCoffee = SoyaMilk(noCoffeineCoffee)
    println("${noCoffeineCoffee.getDesc()} ${noCoffeineCoffee.cost()}")
}