package br.com.APITarefa.model.entity

import lombok.Getter
import java.time.LocalDateTime

@Getter
data class Tarefa(

    val idTarefa: String,
    val nomeTarefa: String,
    val descricaoTarefa: String,
    val nomeUsuarioTarefa: String,
    val prioridadeTarefa: String
)
