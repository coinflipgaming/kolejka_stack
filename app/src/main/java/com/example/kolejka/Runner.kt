package com.example.kolejka

class Stack{
    val elements: MutableList<Any> = mutableListOf()

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    fun push(item: Any) = elements.add(item)

    fun pop() : Any? {
        val item = elements.lastOrNull()
        if (!isEmpty()){
            elements.removeAt(elements.size -1)
        }
        return item
    }
    fun peek() : Any? = elements.lastOrNull()

    override fun toString(): String = elements.toString()

    fun isStackEmpty() = elements.isEmpty()

    fun first(): Any? {
        if(elements.isEmpty()){
            return null
        }
        else {return elements[0]}
    }
}

class Kolejka (lst:MutableList<Any>){

    private val vars: MutableList<Any> = mutableListOf()

    fun isEmpty():Boolean = vars.isEmpty()

    fun count():Int = vars.count()

    override  fun toString() = vars.toString()

    fun enqueue(element:Any){
        vars.add(element)
    }
    fun first(): Any? {
        return if(vars.isEmpty()){
            null
        } else{
            vars[0]
        }

    }

    fun dequeue():Any?{
        if (this.isEmpty()){
            return null
        } else {
            return vars.removeAt(0)
        }
    }

    fun peek() : Any? = vars.lastOrNull()

}

