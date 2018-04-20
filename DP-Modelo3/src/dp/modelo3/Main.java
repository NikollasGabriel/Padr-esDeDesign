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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Freg");
        
        aluno.setEstado(new AlunoEstadoMatriculado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.formar() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.trancar() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.evadir() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.jubilar() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.matricular() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.suspender() + "\n" + aluno.getEstado());
        System.out.println("-------------------------------------");
        
        aluno.setEstado(new AlunoEstadoEvadido());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.formar() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.trancar() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.evadir() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.jubilar() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.matricular() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.suspender() + "\n" + aluno.getEstado());
        System.out.println("-------------------------------------");
        
        aluno.setEstado(new AlunoEstadoFormado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.formar() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.trancar() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.evadir() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.jubilar() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.matricular() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.suspender() + "\n" + aluno.getEstado());
        System.out.println("-------------------------------------");
        
        aluno.setEstado(new AlunoEstadoJubilado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.formar() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.trancar() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.evadir() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.jubilar() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.matricular() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.suspender() + "\n" + aluno.getEstado());
        System.out.println("-------------------------------------");
        
        aluno.setEstado(new AlunoEstadoSuspenso());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.formar() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.trancar() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.evadir()+ "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.jubilar() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.matricular() + "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.suspender() + "\n" + aluno.getEstado());
        System.out.println("-------------------------------------");
        
        aluno.setEstado(new AlunoEstadoTrancado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.formar()+ "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.trancar()+ "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.evadir()+ "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.jubilar()+ "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.matricular()+ "\n" + aluno.getEstado());
        System.out.println("Aluno " + aluno.getNome() + " esta no estado " + aluno.getEstado() + " - " + aluno.suspender()+ "\n" + aluno.getEstado());
        System.out.println("-------------------------------------");
        
    }
    
}
