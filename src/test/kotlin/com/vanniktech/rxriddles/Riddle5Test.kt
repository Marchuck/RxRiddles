package com.vanniktech.rxriddles

import com.vanniktech.rxriddles.solutions.Riddle5Solution
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test

/** Solution [Riddle5Solution] */
class Riddle5Test {

    @InternalCoroutinesApi
    @Test
    fun solve() = runBlockingTest {

        val actual = arrayListOf<Int>()
        val collector = flowCollector<Int> {
            actual.add(it)
        }

        Riddle5.solve(flow {
            emit(0)
            delay(100)
            emit(5)
            delay(100)
            assertListEquals(arrayListOf(0, 5, 11), actual, "third check")
            emit(-6)
            delay(100)
        }, flow {
            delay(50)
            emit(0)
            assertListEquals(arrayListOf(0), actual, "first check")
            delay(100)
            assertListEquals(arrayListOf(0, 5), actual, "second check")
            emit(6)
            delay(100)
        }

        ).collect(collector)

        assertListEquals(arrayListOf(0, 5, 11, 0), actual,"last check")
    }
}
