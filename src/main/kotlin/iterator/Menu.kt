package iterator

import kotlin.collections.Iterator

interface Menu {
    fun createIterator(): Iterator<Int>
}