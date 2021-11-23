package iterator

import org.omg.CORBA.Object

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any
}