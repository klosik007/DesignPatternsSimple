package strategia

class WildDuck : Duck() {
    init{
        quackInterface = Quack()
        flyInterface = IFlyCauseIHaveWings()
    }
    override fun show() {
        println("im the real wild duck!!!")
    }
}