package iterator

class PancakeMenu {
    private val pancakeMenu = arrayListOf(5,10,20,14,45)

    fun createIterator() : Iterator = PancakeMenuIterator(pancakeMenu)
}