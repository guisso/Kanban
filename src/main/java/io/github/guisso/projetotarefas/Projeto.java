package io.github.guisso.projetotarefas;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Descreve o principal elemento do programa: o projeto.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 09/03/2022
 */
public class Projeto {

    private String nome;
    private LocalDate inicio;
    private Cliente cliente;
    private ArrayList<Tarefa> aExecutar;
    private ArrayList<Tarefa> emExecucao;
    private ArrayList<Tarefa> concluidas;
    private ArrayList<Atuacao> atuacoes;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Projeto() {
        aExecutar = new ArrayList<>();
        emExecucao = new ArrayList<>();
        concluidas = new ArrayList<>();
        atuacoes = new ArrayList<>();
    }

    public Projeto(String nome, LocalDate inicio, Cliente cliente) {
        this();
        this.nome = nome;
        this.inicio = inicio;
        this.cliente = cliente;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    //</editor-fold>

    public void adicionarAExecutar(Tarefa tarefa) {
        aExecutar.add(tarefa);
    }

    // todo Analisar método removerAExecutar(tarefa:Tarefa):void
    public void removerAExecutar(Tarefa tarefa)
            throws RuntimeException {
        if (!aExecutar.contains(tarefa)) {
            // Dispara exceção interrompendo a execução deste método
            // e informando ao método invocador que a operação falhou
            throw new RuntimeException("Tentativa de remoção de tarefa inexistente");
        }
        
        // Remove a tarefa (apenas se ela existir)
        aExecutar.remove(tarefa);
    }

    // todo Implementar método adicionarEmExecucao(tarefa:Tarefa):void
    // ???
    // todo Implementar método removerEmExecucao(tarefa:Tarefa):void
    // ???
    // todo Implementar método adicionarConcluida(tarefa:Tarefa):void
    // ???
    // todo Implementar método removerConluida(tarefa:Tarefa):void
    // ???
//    
    public void mover(
            ArrayList<Tarefa> origem,
            ArrayList<Tarefa> destino,
            Tarefa tarefa)
            throws RuntimeException {
        // todo Implementar movimentação genérica de tarefa entre listas
        
        // Se a origem não contém a tarefa a ser movida, dispara uma
        // RunTimeException com mensagem denunciando a ação e
        // gerando a interrupção do procedimento
        // ???
        
        // Recupera e armazena o índice da tarefa a ser removida na origem
        // ???
        
        // Adiciona ao destino a tarefa removida na origem
        // ???
    }

    public void moverParaEmExecucao(Tarefa tarefa)
            throws RuntimeException {
        // todo Implementar movitação de tarefa de aExcutar para emExecucao
        // ???
    }

    public void moverParaConcluidas(Tarefa tarefa)
            throws RuntimeException {
        // todo Implementar movitação de tarefa de emExecucao para concluidas
        // ???
    }

    // todo Implementar método adicionarAtuacao(atuacao:Atuacao):void
    // ???
    // todo Implementar método removerAtuacao(atuacao:Atuacao):void
    // ???
//
    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        return "Projeto{"
                + "nome=" + nome
                + ", inicio=" + inicio
                + ", cliente=" + cliente
                + ", aExecutar=" + aExecutar
                + ", emExecucao=" + emExecucao
                + ", concluidas=" + concluidas
                + ", atuacoes=" + atuacoes
                + '}';
    }
    //</editor-fold>

}
