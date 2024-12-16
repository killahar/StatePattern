package com.example.statepattern

interface State {
    fun handle(context: ButtonContext)
    fun getColor(): Int
    fun getText(): String
}