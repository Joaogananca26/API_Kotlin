package br.com.APIUsuario.controller

import br.com.APIUsuario.model.dto.TarefaCreateRequestDTO
import br.com.APIUsuario.model.dto.TarefaCreateResponseDTO
import br.com.APIUsuario.model.entity.Tarefa
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/tarefas")
class TarefaController {

    fun criarUsuario(tarefaRequest: TarefaCreateRequestDTO): ResponseEntity<TarefaCreateResponseDTO>{
        val tarefa: Tarefa

    }

}