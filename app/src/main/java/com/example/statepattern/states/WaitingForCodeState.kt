package com.example.statepattern.states

import android.graphics.Color
import com.example.statepattern.ButtonContext
import com.example.statepattern.State

class WaitingForCodeState : State {
    override fun handle(context: ButtonContext) {
        val code = context.getCode()
        if (code.toIntOrNull() in 1..3) {
            context.changeState(WaitingForServerResponseState())
        } else {
            context.changeState(RetryState())
        }
        context.hideCodeInput()
    }

    override fun getColor(): Int = Color.parseColor("#ADD8E6") // Светло-голубой
    override fun getText(): String = "Введите код (1-3)"
}