package br.com.APIUsuario.model.dto

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

    @NotBlank
    val diaCriacaoTarefa: Int,

    @NotBlank
    val mesCriacaoTarefa: Int,

    @NotBlank
    val anoCriacaoTarefa: Int

)
