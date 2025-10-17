package br.com.APITarefa.model.domain.input

data class CadastrarTarefaRequest(
    var nomeTarefa: String,
    var descricaoTarefa: String,
    var nomeUsuarioTarefa: String,
    var prioridadeTarefa: String
)