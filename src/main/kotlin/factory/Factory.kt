package factory

abstract class Factory {
    var name: String = ""
    set(name){
        this.name = name}

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