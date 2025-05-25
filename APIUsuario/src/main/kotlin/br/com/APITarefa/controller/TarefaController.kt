package br.com.APITarefa.controller

import br.com.APITarefa.model.dto.TarefaCreateRequestDTO
import br.com.APITarefa.model.dto.TarefaCreateResponseDTO
import br.com.APITarefa.model.entity.Tarefa
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/tarefas")
class TarefaController {

    fun cadastrarTarefa(@RequestBody tarefaRequest: TarefaCreateRequestDTO): ResponseEntity<TarefaCreateResponseDTO>{
        val tarefa: Tarefa = Tarefa
    }

}