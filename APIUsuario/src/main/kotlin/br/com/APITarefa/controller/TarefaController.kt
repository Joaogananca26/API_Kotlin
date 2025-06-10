package br.com.APITarefa.controller


import br.com.APITarefa.config.ModelMapperConfig
import br.com.APITarefa.model.dto.TarefaCreateRequestDTO
import br.com.APITarefa.model.dto.TarefaCreateResponseDTO
import br.com.APITarefa.model.entity.Tarefa
import br.com.APITarefa.repository.TarefaRepository
import br.com.APITarefa.service.TarefaService
import org.apache.coyote.Response
import org.modelmapper.ModelMapper
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
class TarefaController(private val service: TarefaService) {

    @PostMapping
    fun criarTarefa(@RequestBody dto: TarefaCreateRequestDTO) : ResponseEntity<TarefaCreateResponseDTO> {
        val tarefa = Tarefa(dto.nomeTarefa, dto.nomeUsuarioTarefa, dto.descricaoTarefa, dto.prioridadeTarefa)
        service.cadastrarTarefa(tarefa)
        return ResponseEntity.status(HttpStatus.CREATED).build()
    }

    @GetMapping
    fun listarTodasAsTarefas(): List<Tarefa> = service.listarTarefas()

    @GetMapping("/tarefas/{id}")
    fun listarTarefaPorId(@PathVariable id: String) : ResponseEntity<Tarefa> {
        service.listarTarefaPorId(id)

        return ResponseEntity.status(HttpStatus.OK).build()
    }


    @PutMapping("/tarefas/{id}")
    fun atualizarTarefa(@PathVariable id: String, @RequestBody tarefa: Tarefa) : ResponseEntity<Tarefa>{
        service.listarTarefaPorId(id)
        return ResponseEntity.status(HttpStatus.OK).build()
    }


    @DeleteMapping("/tarefas/{id}")
    fun deletarTarefaPorId(@PathVariable id: String) {
        service.listarTarefaPorId(id)
    }

}