package com.jmts.firebase.viewmodel

import com.jmts.firebase.model.Tarea

sealed class TareasState {
    object Loading : TareasState()
    data class Success(val tareas: List<Tarea>) : TareasState()
    data class Error(val message: String) : TareasState()
}