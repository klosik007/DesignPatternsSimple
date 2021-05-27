package strategia

class NoFly: FlyInterface {
    override fun fly() {
        println("I cant fly!!")
    }
}