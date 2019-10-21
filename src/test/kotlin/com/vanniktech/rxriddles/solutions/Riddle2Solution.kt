package com.vanniktech.rxriddles.solutions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

object Riddle2Solution {
  fun solve(source: Flow<Int>)
      = source.map { value -> value + 1 }
}
