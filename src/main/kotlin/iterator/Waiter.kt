package iterator

import kotlin.collections.Iterator

class Waiter(val dinerMenu: Menu, val pancakeMenu: Menu) {
    fun printMenu(){
        val dinerMenuIterator: Iterator<Int> = dinerMenu.createIterator()
        val pancakeMenuIterator: Iterator<Int> = pancakeMenu.createIterator()

        println("MENU\n----\nSNIADANIA")
        printMenu(pancakeMenuIterator)
        println("\nLUNCH")
        printMenu(dinerMenuIterator)
    }

    fun printMenu(iterator: Iterator<Int>) {
        while(iterator.hasNext()) {
            val menuPosition = iterator.next()
            println(menuPosition)
        }
    }
}