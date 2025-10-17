package br.com.APITarefa.model.entity

import com.fasterxml.jackson.annotation.JsonFormat
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import java.time.LocalDateTime

@Entity
@Table(name = "TB_TAREFA")
data class Tarefa(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_tarefa", length = 36, updatable = false, nullable = false)
    var idTarefa: String? = null,

    @field:NotBlank
    @Column(name = "nome_tarefa", nullable = false)
    var nomeTarefa: String,

    @field:NotBlank
    @Column(name = "descricao_tarefa", nullable = false)
    var descricaoTarefa: String,

    @field:NotBlank
    @Column(name = "nome_usuario_tarefa", nullable = false)
    var nomeUsuarioTarefa: String,

    @field:NotBlank
    @Column(name = "prioridade_tarefa", nullable = false)
    var prioridadeTarefa: String,

    @field:JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "data_hora_tarefa", nullable = false, updatable = false)
    var dataHoraTarefa: LocalDateTime = LocalDateTime.now()
)
