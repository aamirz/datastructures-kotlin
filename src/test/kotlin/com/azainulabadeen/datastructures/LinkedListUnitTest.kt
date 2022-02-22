package com.azainulabadeen.datastructures

import org.junit.Test
import kotlin.test.assertEquals

class LinkedListUnitTest {
    @Test
    fun emptyListCount() {
        assertEquals(0, LinkedListFactory.createLinkedList<Int>().count())
    }

    @Test
    fun singleElementListCount() {
        val list = LinkedListFactory.createLinkedList<Int>()
        list.add(1)
        assertEquals(1, list.count())
    }

    @Test
    fun threeElementListCount() {
        val list = LinkedListFactory.createLinkedList<Int>()
        list.add(1)
        list.add(2)
        list.add(3)
        assertEquals(3, list.count())
    }

    @Test
    fun removeFromEmptyList() {
        val list = LinkedListUnitTestUtils.generateIntList()
        list.remove(0)
        assertEquals(0, list.count())
    }

    @Test
    fun removeFromSingleElementList() {
        val list = LinkedListUnitTestUtils.generateIntList(1)
        list.remove(0)
        assertEquals(0, list.count())
    }

    @Test
    fun removeFromThreeElementList() {
        val list = LinkedListUnitTestUtils.generateIntList(3)
        list.remove(1)
        assertEquals(2, list.count())
    }
}

object LinkedListUnitTestUtils {
    fun generateIntList(count: Int = 0): LinkedList<Int> {
        val list = LinkedListFactory.createLinkedList<Int>()
        for (i in 0 until count) {
            list.add(i)
        }
        return list
    }
}