package iterator

class DinerMenu {
    private val dinerMenu = arrayOf(5,20,36,55,66)

    fun createIterator() : Iterator = DinerMenuIterator(dinerMenu)
}