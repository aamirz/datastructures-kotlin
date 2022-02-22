package com.azainulabadeen.datastructures

interface LinkedList<T>: Iterable<T> {
    /**
     * Add an element to the back of the list.
     */
    fun add(element: T)

    /**
     * Remove an element from the back of the list.
     */
    fun remove(element: T)

    /**
     * Return the total count of elements in the linked list.
     */
    fun count(): Int
}