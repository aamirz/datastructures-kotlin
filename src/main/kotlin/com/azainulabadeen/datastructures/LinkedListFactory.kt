package com.azainulabadeen.datastructures

object LinkedListFactory {
    fun <T> createLinkedList(): LinkedList<T> {
        return SimpleLinkedList<T>()
    }
}