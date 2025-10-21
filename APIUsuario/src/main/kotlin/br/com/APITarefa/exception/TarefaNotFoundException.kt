package br.com.APITarefa.exception

class TarefaNotFoundException(id: String) : RuntimeException("Tarefa com o ID: $id não encontrada.")