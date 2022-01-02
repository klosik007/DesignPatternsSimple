package iterator

import kotlin.collections.Iterator

class DinerMenu: Menu {
    private val dinerMenu = arrayOf(5,20,36,55,66)
    override fun createIterator(): Iterator<Int> = dinerMenu.iterator()
}