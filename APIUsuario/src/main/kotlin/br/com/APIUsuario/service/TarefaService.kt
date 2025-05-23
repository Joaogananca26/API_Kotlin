package br.com.APIUsuario.service


import br.com.APIUsuario.model.entity.Tarefa
import br.com.APIUsuario.repository.TarefaRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Service
class TarefaService(val repository: TarefaRepository) {

    fun cadastrarTarefa (tarefa: Tarefa): Tarefa {
        return repository.save(tarefa)
    }

    fun listarTarefas(): List<Tarefa> {
        return repository.findAll()
    }

    fun listarTarefaPorId(@PathVariable idTarefa: String): Tarefa{
        return repository.findById(idTarefa)
            .orElseThrow()
    }


}