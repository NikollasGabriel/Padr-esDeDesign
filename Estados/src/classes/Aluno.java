package classes;

public class Aluno {

    public String nome;
    public AlunoEstado estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AlunoEstado getEstado() {
        return estado;
    }

    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }
       
    public Aluno() {
        this.estado = new AlunoEstadoMatriculado();
    }

    public String matricular() {
        return estado.matricular();
    }

    public String formar() {
        return estado.formar();
    }

    public String evadir() {
        return estado.evadir();
    }

    public String jubilar() {
        return estado.jubilar();
    }

    public String suspender() {
        return estado.suspender();
    }

    public String trancar() {
        return estado.trancar();
    }

}
