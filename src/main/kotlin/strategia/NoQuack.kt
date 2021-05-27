package strategia

class NoQuack : QuackInterface {
    override fun quack() {
        println("I dont quack!!!")
    }
}