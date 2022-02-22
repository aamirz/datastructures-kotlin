package com.azainulabadeen.datastructures

class SimpleLinkedList<T> : LinkedList<T> {

    private class Node<T>(val value: T, var next: Node<T>?)
    private class HeadNode<T>(var next: Node<T>?)

    private var tailNode: Node<T>? = null
    private val head: HeadNode<T> = HeadNode(tailNode)

    override fun add(element: T) {
        val node = Node(element, null)
        when (tailNode) {
            null -> {
                tailNode = node
                head.next = tailNode
            }
            else -> {
                tailNode?.next = node
                tailNode = node
            }
        }
    }

    override fun remove(element: T) {
        var previous = head.next
        if (previous?.next == null) {
            if (previous?.value?.equals(element) == true) {
                tailNode = null
                head.next = tailNode
            } else {
                // nothing to do in this case
            }
        } else {
            var current = previous.next
            while (current != null) {
                if (current.value?.equals(element) == true) {
                    previous?.next = current.next
                    if (current == tailNode) {
                        tailNode = previous
                    }
                    break
                }
                previous = current
                current = current.next
            }
        }
    }

    override fun iterator(): Iterator<T> {
        return object: Iterator<T> {
            private var current = head.next

            override fun hasNext(): Boolean {
                return current != null
            }

            override fun next(): T {
                val value = current
                current = current?.next
                return value?.value!!
            }
        }
    }

    override fun count(): Int {
        return this.count { true }
    }

}