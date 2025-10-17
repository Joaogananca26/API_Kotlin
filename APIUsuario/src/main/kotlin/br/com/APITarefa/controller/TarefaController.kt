package br.com.APITarefa.controller



import br.com.APITarefa.model.domain.input.AtualizarTarefaRequest
import br.com.APITarefa.model.domain.input.CadastrarTarefaRequest
import br.com.APITarefa.model.domain.output.CadastrarTarefaResponse
import br.com.APITarefa.model.entity.Tarefa
import br.com.APITarefa.service.TarefaService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tarefas")
class TarefaController(private val service: TarefaService) {

    @GetMapping("/listar")
    fun listarTarefas(): List<Tarefa> = service.listarTarefas()

    @PostMapping("/cadastrar", consumes = ["application/json"], produces = ["application/json"])
    fun cadastrarTarefa(@RequestBody @Valid req: CadastrarTarefaRequest): ResponseEntity<CadastrarTarefaResponse> {

        val nova = Tarefa(
            nomeTarefa = req.nomeTarefa,
            descricaoTarefa = req.descricaoTarefa,
            nomeUsuarioTarefa = req.nomeUsuarioTarefa,
            prioridadeTarefa = req.prioridadeTarefa,
        )

        val salva = service.cadastrarTarefa(nova)

        val resp = CadastrarTarefaResponse(
            idTarefa = salva.idTarefa!!,
            nomeTarefa = salva.nomeTarefa,
            descricaoTarefa = salva.descricaoTarefa,
            nomeUsuarioTarefa = salva.nomeUsuarioTarefa,
            prioridadeTarefa = salva.prioridadeTarefa,
            dataHoraTarefa = salva.dataHoraTarefa
        )

        return ResponseEntity.status(HttpStatus.CREATED).body(resp)
    }

    @GetMapping("/listar/{id}")
    fun listarTarefaPorID(@PathVariable id: String) = service.listarTarefaPorId(id)

    @DeleteMapping("/deletar/{id}")
    fun deletarTarefa(@PathVariable id: String): ResponseEntity<Void> {
        service.deletarTarefa(id)
        return ResponseEntity.noContent().build()
    }

    @PutMapping("/atualizar/{id}")
    fun atualizarTarefa(@PathVariable id: String, @RequestBody @Valid req: AtualizarTarefaRequest): ResponseEntity<CadastrarTarefaResponse> {
        val tarefaExistente = service.listarTarefaPorId(id)

        val tarefaAtualizada = tarefaExistente.copy(
            nomeUsuarioTarefa = req.nomeUsuarioTarefa,
            prioridadeTarefa = req.prioridadeTarefa
        )

        val salva = service.cadastrarTarefa(tarefaAtualizada)

        val resp = CadastrarTarefaResponse(
            idTarefa = salva.idTarefa!!,
            nomeTarefa = salva.nomeTarefa,
            descricaoTarefa = salva.descricaoTarefa,
            nomeUsuarioTarefa = salva.nomeUsuarioTarefa,
            prioridadeTarefa = salva.prioridadeTarefa,
            dataHoraTarefa = salva.dataHoraTarefa
        )

        return ResponseEntity.ok(resp)
    }
}