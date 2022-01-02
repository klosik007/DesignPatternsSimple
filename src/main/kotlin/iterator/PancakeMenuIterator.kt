package iterator

import kotlin.collections.Iterator

class PancakeMenuIterator(val elements : ArrayList<Int>) : Iterator<Int> {
    var position = 0

    override fun hasNext(): Boolean {
        return position < elements.size
    }

    override fun next(): Int {
        val menuPos = elements.get(position)
        position++
        return menuPos
    }
}