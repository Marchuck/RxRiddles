package com.vanniktech.rxriddles

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter

object Riddle3 {
    /**
     * Don't emit odd numbers from the [source] Observable.
     *
     * Use case: You want to filter certain items out.
     */
    fun solve(source: Flow<Int>): Flow<Int> {
        return source.filter { it % 2 == 0 }
    }
}
