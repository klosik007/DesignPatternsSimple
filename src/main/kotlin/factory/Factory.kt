package factory

abstract class Factory {
    var name: String = ""

    //implementation
    abstract fun prepare()

    fun packing(){}

//    fun setPizzaName(name: String){
//        this.name = name
//    }

    override fun toString(): String {
        return "pizza jest super"
    }
}