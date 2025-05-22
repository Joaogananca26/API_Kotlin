package br.com.APIUsuario.service

import br.com.APIUsuario.model.dto.TarefaCreateRequestDTO
import br.com.APIUsuario.model.dto.TarefaCreateResponseDTO
import br.com.APIUsuario.model.entity.Tarefa
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories
class TarefaService {

    fun cadastrarTarefa(tarefaRequest: TarefaCreateRequestDTO): TarefaCreateResponseDTO {
    }

}