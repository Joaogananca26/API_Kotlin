package br.com.APITarefa.model.dto

import java.time.LocalDateTime

data class TarefaCreateResponseDTO(
    val idTarefa: String,
    val descricaoTarefa: String,
    val nomeUsuarioTarefa: String,
    val prioridadeTarefa: String
)
