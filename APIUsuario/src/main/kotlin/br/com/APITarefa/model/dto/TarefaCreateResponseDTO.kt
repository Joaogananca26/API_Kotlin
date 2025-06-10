package br.com.APITarefa.model.dto


data class TarefaCreateResponseDTO(
    val idTarefa: String,
    val descricaoTarefa: String,
    val nomeUsuarioTarefa: String,
    val prioridadeTarefa: String
)
