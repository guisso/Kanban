package io.github.guisso.projetotarefas;

/**
 * Representa o cliente que solicitou o projeto.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 09/03/2022
 */
public class Cliente {

    private String nome;
    private Long telefone;
    private String email;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Cliente() {
    }

    public Cliente(String nome, Long telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        return "Cliente{"
                + "nome=" + nome
                + ", telefone=" + telefone
                + ", email=" + email
                + '}';
    }
    //</editor-fold>

}
