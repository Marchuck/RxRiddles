package com.vanniktech.rxriddles.solutions

import io.reactivex.Observable

object Riddle3Solution {
    fun solve(source: Observable<Int>) = source.filter { it % 2 == 0 }
}
