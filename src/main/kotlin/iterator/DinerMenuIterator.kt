package iterator

class DinerMenuIterator(val elements : Array<Int>) : Iterator {
    var position = 0

    override fun hasNext() : Boolean {
        return position < elements.size
    }

    override fun next() : Any {
        val menuPos = elements[position]
        position++
        return menuPos
    }
}