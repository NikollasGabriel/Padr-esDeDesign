/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author asus note
 */
public class AlunoEstadoTrancado implements AlunoEstado{

    public String getEstado() {
        return "Trancado";
    }

    public String matricular() {
        return "Aluno pode matricular";
    }

    public String formar() {
        return "Aluno não pode ser formar";
    }

    public String trancar() {
        return "Aluno não pode trancar";
    }

    public String jubilar() {
        return "Aluno pode jubilar";
    }

    public String suspender() {
        return "Aluno não pode suspender";
    }

    public String evadir() {
        return "Aluno pode evadir";
    }

}
