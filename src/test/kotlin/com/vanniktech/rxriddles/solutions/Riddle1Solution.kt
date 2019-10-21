package com.vanniktech.rxriddles.solutions

import kotlinx.coroutines.flow.flow

object Riddle1Solution {
  fun solve(value: Int)
      = flow { emit(value) }
}
