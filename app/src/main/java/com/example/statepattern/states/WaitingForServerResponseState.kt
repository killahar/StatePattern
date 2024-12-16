package com.example.statepattern.states

import android.graphics.Color
import android.os.Handler
import android.os.Looper
import com.example.statepattern.ButtonContext
import com.example.statepattern.State

class WaitingForServerResponseState : State {
    override fun handle(context: ButtonContext) {
        context.showToast("Код принят. Ожидание ответа от сервера...")
        Handler(Looper.getMainLooper()).postDelayed({
            context.changeState(SuccessState())
            context.updateButton()
        }, 5000) // Задержка 5 секунд
    }

    override fun getColor(): Int = Color.parseColor("#FFFFCC") // Светло-жёлтый
    override fun getText(): String = "Ожидание ответа от сервера..."
}
