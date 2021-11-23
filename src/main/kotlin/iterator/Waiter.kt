package iterator

class Waiter(val dinerMenu: DinerMenu, val pancakeMenu: PancakeMenu) {
    fun printMenu(){
        val dinerMenuIterator : Iterator = dinerMenu.createIterator()
        val pancakeMenuIterator : Iterator = pancakeMenu.createIterator()

        println("MENU\n----\nSNIADANIA")
        printMenu(pancakeMenuIterator)
        println("\nLUNCH")
        printMenu(dinerMenuIterator)
    }

    fun printMenu(iterator: Iterator) {
        while(iterator.hasNext()) {
            val menuPosition = iterator.next()
            println(menuPosition)
        }
    }
}