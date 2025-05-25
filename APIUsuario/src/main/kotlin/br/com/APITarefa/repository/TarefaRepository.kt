package br.com.APITarefa.repository

import br.com.APITarefa.model.entity.Tarefa
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface TarefaRepository: JpaRepository<Tarefa, String> {
}