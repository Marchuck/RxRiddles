package com.vanniktech.rxriddles

import com.vanniktech.rxriddles.solutions.Riddle2Solution
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.test.runBlockingTest
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test


/** Solution [Riddle2Solution] */
class Riddle2Test {


    @InternalCoroutinesApi
    @Test
    fun solve() = runBlockingTest {

        val input = arrayListOf(0, 1, 6)
        val expected = arrayListOf(1, 2, 7)

        val actual = arrayListOf<Int>()

        val collector = flowCollector<Int> { actual.add(it) }

        Riddle2.solve(input.asFlow()).collect(collector)

        assertListEquals(expected, actual)
    }
}

fun <T> flowCollector(block: (T) -> Unit) = object : FlowCollector<T> {
    override suspend fun emit(value: T) {
        block(value)
    }
}

inline fun <reified T> assertListEquals(expected: List<T>, actual: List<T>,message:String = "") {
    assertArrayEquals(expected.toTypedArray(), actual.toTypedArray(),message)
}