package br.com.APITarefa.model.dto

import jakarta.validation.constraints.NotBlank

data class TarefaCreateRequestDTO(
    @NotBlank
    val nomeTarefa: String,

    val descricaoTarefa: String,

    @NotBlank
    val nomeUsuarioTarefa: String,

    val prioridadeTarefa: String,

)
