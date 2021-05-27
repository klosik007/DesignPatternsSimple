package strategia

fun main(args: Array<String>) {
    val wildDuck: Duck = WildDuck()
    wildDuck.makeFly()
    wildDuck.makeQuack()

    val model: Duck = DuckModel()
    model.makeFly()
    model.flyInterfaceSet(RocketFlyDuck())
    model.makeFly()
}