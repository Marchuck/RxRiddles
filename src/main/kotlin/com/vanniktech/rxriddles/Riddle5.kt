package com.vanniktech.rxriddles

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine

object Riddle5 {
    /**
     * Sum up the latest values of [first] and [second] whenever one of the Observables emits a new value.
     *
     * Use case: Two input fields in a calculator that need to be summed up and the result should be updated every time one of the inputs change.
     */
    fun solve(first: Flow<Int>, second: Flow<Int>): Flow<Int> {
        return first.combine( second, reducer())
    }

    private fun reducer(): suspend (a: Int, b: Int) -> Int {
        return { first, second -> first + second }
    }
}
