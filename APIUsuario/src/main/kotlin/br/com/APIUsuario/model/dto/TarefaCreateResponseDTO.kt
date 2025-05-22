package br.com.APIUsuario.model.dto

import java.time.LocalDateTime

data class TarefaCreateResponseDTO(
    val idTarefa: String? = null,
    val descricaoTarefa: String,
    val nomeUsuarioTarefa: String,
    val prioridadeTarefa: String,
    val dataCriacaoTarefa: LocalDateTime
)
