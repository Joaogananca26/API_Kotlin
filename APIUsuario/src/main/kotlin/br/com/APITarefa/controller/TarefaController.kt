package br.com.APITarefa.controller


import br.com.APITarefa.dto.request.CadastrarTarefaRequest
import br.com.APITarefa.dto.response.CadastrarTarefaResponse
import br.com.APITarefa.model.entity.Tarefa
import br.com.APITarefa.repository.TarefaRepository
import org.apache.coyote.Response
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/tarefas")
class TarefaController(private val repository: TarefaRepository) {

    @PostMapping
    fun criarTarefa(@RequestBody tarefaRequest: CadastrarTarefaRequest): ResponseEntity<CadastrarTarefaResponse> {
        val tarefa: String = tarefaRequest.idTarefa
    }
}