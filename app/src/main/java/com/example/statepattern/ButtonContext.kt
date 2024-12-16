package com.example.statepattern

import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.statepattern.states.WaitingForCodeState
import java.security.PrivateKey

class ButtonContext(
    private val button: Button,
    private val codeInput: EditText,
    private val rootLayout: View,
    private val text: TextView
) {
    private var state: State = WaitingForCodeState()

    init {
        updateButton()
        button.setOnClickListener {
            state.handle(this)
            updateButton()
        }
    }

    fun changeState(newState: State) {
        state = newState
    }

    fun updateButton() {
        text.text = state.getText()
        rootLayout.setBackgroundColor(state.getColor())
    }

    fun getCode(): String {
        return codeInput.text.toString()
    }

    fun showToast(message: String) {
        Toast.makeText(button.context, message, Toast.LENGTH_SHORT).show()
    }

    fun hideCodeInput() {
        codeInput.visibility = View.GONE
    }

    fun showCodeInput() {
        codeInput.visibility = View.VISIBLE
    }
}