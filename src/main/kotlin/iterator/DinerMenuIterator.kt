package iterator

import kotlin.collections.Iterator

class DinerMenuIterator(val elements : Array<Int>): Iterator<Int> {
    var position = 0

    override fun hasNext(): Boolean {
        return position < elements.size
    }

    override fun next(): Int {
        val menuPos = elements[position]
        position++
        return menuPos
    }
}