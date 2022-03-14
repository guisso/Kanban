package io.github.guisso.projetotarefas;

import java.time.LocalDate;

/**
 * Descreve a atuação de um colaborador em um projeto.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 09/03/2022
 */
public class Atuacao {

    private LocalDate entrada;
    private LocalDate saida;
    private Papel papel;
    // todo Implementar atributo membro e respectivos métodos
    // ???

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Atuacao() {
    }

    public Atuacao(LocalDate entrada, LocalDate saida, Papel papel) {
        this.entrada = entrada;
        this.saida = saida;
        this.papel = papel;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }

    public LocalDate getSaida() {
        return saida;
    }

    public void setSaida(LocalDate saida) {
        this.saida = saida;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        return "Atuacao{"
                + "entrada=" + entrada
                + ", saida=" + saida
                + ", papel=" + papel
                + '}';
    }
    //</editor-fold>

}
