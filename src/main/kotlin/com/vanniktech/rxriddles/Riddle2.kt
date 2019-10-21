package com.vanniktech.rxriddles

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

object Riddle2 {
    /**
     * Increment each emitted value of the given [source] by 1.
     *
     * Use case: You want to transform the data.
     */
    @ExperimentalCoroutinesApi
    fun solve(source: Flow<Int>): Flow<Int> = source.map { value -> value + 1 }
}
