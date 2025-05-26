package br.com.APITarefa.controller


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
    fun criarTarefa(@RequestBody tarefa: Tarefa) = repository.save(tarefa)

    @GetMapping
    fun listarTodasAsTarefas(): List<Tarefa> = repository.findAll()

    @GetMapping("/tarefas/{id}")
    fun listarTarefaPorId(@PathVariable id: String) : ResponseEntity<Tarefa> =
        repository.findById(id).map {
            ResponseEntity.ok(it)
        } .orElse(ResponseEntity.notFound().build())

    @PutMapping("/tarefas/{id}")
    fun atualizarTarefa(@PathVariable id: String, @RequestBody tarefa: Tarefa) : ResponseEntity<Tarefa> =
        repository.findById(id).map {
            val tarefaParaAtualizar = it.copy(
                idTarefa = it.idTarefa,
                nomeTarefa = it.nomeTarefa,
                descricaoTarefa = it.descricaoTarefa,
                prioridadeTarefa = it.prioridadeTarefa,
                nomeUsuarioTarefa = it.nomeUsuarioTarefa
            )
            ResponseEntity.ok(repository.save(tarefaParaAtualizar))
        }.orElse(ResponseEntity.notFound().build())

    @DeleteMapping("/tarefas/{id}")
    fun deletarTarefaPorId(@PathVariable id: String) : ResponseEntity<Void> =
        repository.findById(id).map {
            repository.delete(it)
            ResponseEntity<Void>(HttpStatus.OK)
        }.orElse(ResponseEntity.notFound().build())

}