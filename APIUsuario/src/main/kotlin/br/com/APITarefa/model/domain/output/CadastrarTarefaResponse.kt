package br.com.APITarefa.model.domain.output

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime

data class CadastrarTarefaResponse(
    var idTarefa: String,
    var nomeTarefa: String,
    var descricaoTarefa: String,
    var nomeUsuarioTarefa: String,
    var prioridadeTarefa: String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    var dataHoraCriacaoTarefa: LocalDateTime
)