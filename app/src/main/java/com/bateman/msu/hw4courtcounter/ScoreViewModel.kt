package com.bateman.msu.hw4courtcounter

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

var scoreTeamA = 0
var scoreTeamB = 0

private const val TAG = "ScoreViewModel"
const val CURRENT_INDEX_KEY = "CURRENT_INDEX_KEY"

class ScoreViewModel(private val savedStateHandle: SavedStateHandle): ViewModel() {

private var currentIndex: Int
        get() = savedStateHandle.get(CURRENT_INDEX_KEY)?:0
        set(value) = savedStateHandle.set(CURRENT_INDEX_KEY, value)

    var scoreTeamA: Int = 0
    var scoreTeamB: Int = 0
}
