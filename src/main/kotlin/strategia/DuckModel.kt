package strategia

class DuckModel: Duck() {
    init{
        flyInterface = NoFly()
        quackInterface = Quack()
    }
    override fun show() {
        println("im a duck model")
    }
}