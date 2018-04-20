/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estados;

import classes.Aluno;
import classes.AlunoEstadoMatriculado;

/**
 *
 * @author asus note
 */
public class Estados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Roberto");
        
        aluno.setEstado(new AlunoEstadoMatriculado());
        
        System.out.println("Aluno " + aluno.getNome() + " está no estado " + aluno);
    }
    
}
