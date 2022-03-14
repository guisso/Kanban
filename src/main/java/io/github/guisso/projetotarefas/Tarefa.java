package io.github.guisso.projetotarefas;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Descreve uma tarefa a ser executada por um colaborador da equipe.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 09/03/2022
 */
public class Tarefa {

    private String descricao;
    private LocalDate limite;
    private LocalDate conclusao;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Tarefa() {
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public Tarefa(String descricao, LocalDate limite) {
        this.descricao = descricao;
        this.limite = limite;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getLimite() {
        return limite;
    }

    public void setLimite(LocalDate limite) {
        this.limite = limite;
    }

    public LocalDate getConclusao() {
        return conclusao;
    }

    public void setConclusao(LocalDate conclusao) {
        this.conclusao = conclusao;
    }
    //</editor-fold>

    // todo Analisar método estaAtrasada():boolean
    public boolean estaAtrasada() {
        // Sem data limite para entrega
        if (limite == null) {
            return false;
        }

        // Concluída com atraso
        if (conclusao != null) {
            return conclusao.compareTo(limite) > 0;
        }

        // Sem data de conclusão especificada
        return LocalDate.now().compareTo(limite) > 0;
    }

    //<editor-fold defaultstate="collapsed" desc="hashCode/equals/toString">
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.descricao);
        hash = 97 * hash + Objects.hashCode(this.limite);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        return this.hashCode() == obj.hashCode();

//        final Tarefa other = (Tarefa) obj;        
//        if (!Objects.equals(this.descricao, other.descricao)) {
//            return false;
//        }
//        return Objects.equals(this.limite, other.limite);
    }

    @Override
    public String toString() {
        return "Tarefa{"
                + "descricao=" + descricao
                + ", limite=" + limite
                + ", conclusao=" + conclusao
                + ", atrasada=" + estaAtrasada()
                + '}';
    }
    //</editor-fold>

}
