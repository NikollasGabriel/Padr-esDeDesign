/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dp.modelo3;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private String nome;
    private AlunoEstado estado;
    
    
    public Aluno(){
        this.estado = new AlunoEstadoMatriculado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado.getEstado();
    }

    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }

    
    
    public String matricular(){
        return estado.matricular(this);
    }
    public String trancar(){
        return estado.trancar(this);
    }
    public String formar(){
        return estado.formar(this);
    }
    public String suspender(){
        return estado.suspender(this);
    }
    public String evadir(){
        return estado.evadir(this);
    }
    public String jubilar(){
        return estado.jubilar(this);
    }
}
