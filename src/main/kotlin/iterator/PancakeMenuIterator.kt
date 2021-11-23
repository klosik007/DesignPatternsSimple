package iterator

class PancakeMenuIterator(val elements : ArrayList<Int>) : Iterator {
    var position = 0

    override fun hasNext(): Boolean {
        return position < elements.size
    }

    override fun next(): Any {
        val menuPos = elements.get(position)
        position++
        return menuPos
    }
}