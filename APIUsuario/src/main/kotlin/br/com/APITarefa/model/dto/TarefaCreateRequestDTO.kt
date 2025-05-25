package br.com.APITarefa.model.dto

import jakarta.validation.constraints.NotBlank

data class TarefaCreateRequestDTO(
    @NotBlank
    val nomeTarefa: String,

    @NotBlank
    val descricaoTarefa: String,

    @NotBlank
    val nomeUsuarioTarefa: String,

    @NotBlank
    val prioridadeTarefa: String,

)
