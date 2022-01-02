package iterator

import kotlin.collections.Iterator

class PancakeMenu: Menu {
    private val pancakeMenu = arrayListOf(5,10,20,14,45)
    override fun createIterator(): Iterator<Int> = pancakeMenu.iterator()
}