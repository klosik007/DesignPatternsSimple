package strategia

abstract class Duck {
    lateinit var  flyInterface: FlyInterface
    lateinit var quackInterface: QuackInterface

    abstract fun show()

    fun makeFly(){
        flyInterface.fly()
    }

    fun makeQuack(){
        quackInterface.quack()
    }

    fun swim(){
        println("All ducks can swim, even the artificial ones!")
    }

    fun flyInterfaceSet(fI: FlyInterface){
        flyInterface = fI
    }

    fun quackInterfaceSet(qI: QuackInterface){
        quackInterface = qI
    }


}