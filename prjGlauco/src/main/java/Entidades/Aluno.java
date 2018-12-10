package Entidades;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Aluno extends Pessoa{
	
    private String Escolaridade;
    
    @OneToOne
    private Matricula matricula;
    
    public void setMatricula(Matricula M){
        this.matricula = M;
        M.setAluno(this);
    }
    
    public void setEscolaridade(String Escolaridade){
        this.Escolaridade = Escolaridade;
    }

    public String getEscolaridade() {
        return Escolaridade;
    }

    public Matricula getMatricula() {
        return matricula;
    }
	
}