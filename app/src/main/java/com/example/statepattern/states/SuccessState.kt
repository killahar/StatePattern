package com.example.statepattern.states

import android.graphics.Color
import com.example.statepattern.ButtonContext
import com.example.statepattern.State

class SuccessState : State {
    override fun handle(context: ButtonContext) {
        context.showToast("Операция успешна!")
        context.changeState(WaitingForCodeState())
        context.showCodeInput()
    }

    override fun getColor(): Int = Color.parseColor("#B0E57C") // Светло-зелёный
    override fun getText(): String = "Операция успешна!"
}