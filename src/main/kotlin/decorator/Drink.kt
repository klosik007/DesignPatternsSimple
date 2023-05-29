package decorator

abstract class Drink() {
    open var description = "Napój nieznany"
    open var size = "Nieznana wielkość"

    open fun getDesc(): String {
        return description
    }

    fun setQuantity(size: String) {
        when(size) {
            "small" -> { this.size = "small"; description += " mała"}
            "medium" -> { this.size = "medium"; description += " średnia"}
            "large" -> { this.size = "large"; description += " duża"}
        }
    }

    fun getQuantity() = this.size

    abstract fun cost(): Double
}