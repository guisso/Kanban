package io.github.guisso.projetotarefas;

/**
 * Mantém os dados relevantes do membro que atua como colaborador em um projeto.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 09/03/2022
 */
public class Membro {

    private String nome;
    private Integer telefone;
    private String email;
    private Float salario;
    // todo Implementar atributo lista de tarefas e respectivos métodos
    // ???

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Membro() {
    }

    public Membro(String nome, Integer telefone, String email, Float salario) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.salario = salario;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        return "Membro{"
                + "nome=" + nome
                + ", telefone=" + telefone
                + ", email=" + email
                + ", salario=" + salario
                + '}';
    }
    //</editor-fold>

}
