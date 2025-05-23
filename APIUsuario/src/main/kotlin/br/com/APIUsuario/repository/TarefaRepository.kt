package br.com.APIUsuario.repository

import br.com.APIUsuario.model.entity.Tarefa
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface TarefaRepository: JpaRepository<Tarefa, String> {
}