package Entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Instrutor extends Pessoa{
    private String Formacao, AreaAtuacao;
    
    @OneToMany(mappedBy="instrutor")
	private List<Turma> turmas = new ArrayList<Turma>();
    
	public void setFormacao(String Formacao) {
        this.Formacao = Formacao;
    }

    public String getFormacao() {
        return Formacao;
    }

    public String getAreaAtuacao() {
        return AreaAtuacao;
    }

    public void setAreaAtuacao(String AreaAtuacao) {
        this.AreaAtuacao = AreaAtuacao;
    }

	public void addTurma(Turma turma)
	{
		turmas.add(turma);
	}
	
    public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
	
	
}
