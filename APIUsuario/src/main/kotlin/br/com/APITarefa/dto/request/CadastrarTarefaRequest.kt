package br.com.APITarefa.dto.request

data class CadastrarTarefaRequest(
    val idTarefa: String,
    val nomeTarefa: String,
    val descricaoTarefa: String,
    val prioriadadeTarefa: String,
    val nomeUsuarioTarefa: String
)
