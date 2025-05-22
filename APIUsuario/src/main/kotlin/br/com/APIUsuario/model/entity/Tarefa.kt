package br.com.APIUsuario.model.entity

import java.time.LocalDateTime


data class Tarefa(

    val idTarefa: String,
    val nomeTarefa: String,
    val descricaoTarefa: String,
    val nomeUsuarioTarefa: String,
    val prioridadeTarefa: String,
    val dataCriacaoTarefa: LocalDateTime
)
