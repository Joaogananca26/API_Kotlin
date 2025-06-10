package br.com.APITarefa.model.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.Getter

@Getter
@Entity
data class Tarefa(

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_tarefa")
    val idTarefa: String,

    @Column(name = "nome_tarefa")
    val nomeTarefa: String,

    @Column(name = "descricao_tarefa")
    val descricaoTarefa: String,

    @Column(name = "nome_usuario_tarefa")
    val nomeUsuarioTarefa: String,

    @Column(name = "prioridade_tarefa")
    val prioridadeTarefa: String
)
