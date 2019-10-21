package com.vanniktech.rxriddles.solutions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine

object Riddle5Solution {

  fun solve(first: Flow<Int>, second: Flow<Int>): Flow<Int> {
    return first.combine( second, transform())
  }

  private fun transform(): suspend (a: Int, b: Int) -> Int {
    return { first, second -> first + second }
  }
}
