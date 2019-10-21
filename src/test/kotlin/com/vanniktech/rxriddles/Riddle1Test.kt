package com.vanniktech.rxriddles

import com.vanniktech.rxriddles.solutions.Riddle1Solution
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

/** Solution [Riddle1Solution] */


class Riddle1Test {

    @InternalCoroutinesApi
    @Test
    fun solve() = runBlocking {

        val mockCollector: FlowCollector<Int> = mockk(relaxed = true)

        Riddle1.solve(5).collect(mockCollector)

        coVerify { mockCollector.emit(5) }

    }
}
