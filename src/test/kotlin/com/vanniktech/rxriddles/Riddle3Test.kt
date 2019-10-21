package com.vanniktech.rxriddles

import com.vanniktech.rxriddles.solutions.Riddle3Solution
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test

/** Solution [Riddle3Solution] */
class Riddle3Test {
    @InternalCoroutinesApi
    @Test
    fun solve() = runBlockingTest {

        val input = flowOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val expected = arrayListOf(0, 2, 4, 6, 8, 10)

        val actual = arrayListOf<Int>()

        val collector = object : FlowCollector<Int> {
            override suspend fun emit(value: Int) {
                actual.add(value)
            }
        }

        Riddle3.solve(input).collect(collector)

        assertListEquals(expected, actual)
    }
}
