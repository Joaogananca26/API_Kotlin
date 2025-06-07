package br.com.APITarefa.dto.response

data class CadastrarTarefaResponse(
    val idTarefa: String,
    val nomeTarefa: String,
    val descricaoTarefa: String,
    val prioridadeTarefa: String,
    val nomeUsuarioTarefa: String
)
