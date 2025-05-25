package br.com.APITarefa.service


import br.com.APITarefa.model.entity.Tarefa
import br.com.APITarefa.repository.TarefaRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable

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