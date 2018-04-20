package classes;

public class AlunoEstadoMatriculado implements AlunoEstado{
    
    public String getEstado(){
        return "Matriculado";
    }
    
    public String matricular(){
        return "matricula nao efetuada, ja matriculado";
    }
    
    public String formar(){
        return "Aluno pode ser formar";
    }

    public String trancar() {
        return "Aluno pode trancar";
    }

    public String jubilar() {
        return "Aluno pode jubilar";        
    }

    public String suspender() {
        return "Aluno pode suspender";        
    }

    public String evadir() {
        return "Aluno pode evadir";        
    }
    
}
