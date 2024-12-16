package com.example.statepattern.states

import android.graphics.Color
import com.example.statepattern.ButtonContext
import com.example.statepattern.State

class RetryState : State {
    override fun handle(context: ButtonContext) {
        context.showToast("Неправильный код. Попробуйте снова.")
        context.changeState(WaitingForCodeState())
        context.showCodeInput()
    }

    override fun getColor(): Int = Color.parseColor("#FFC0CB")
    override fun getText(): String = "Неправильный код. Попробуйте снова."
}
