package com.example.tictactoe.ui

sealed class UserActions {
    object PlayAgainButtonClicked: UserActions()
    data class BoardTapped(val cellNo: Int): UserActions()
}
