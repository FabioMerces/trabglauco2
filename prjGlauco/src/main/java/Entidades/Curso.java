package Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Curso implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    private String Sigla; 
	private String Nome, DataVigencia, Programa;
    private int CargaHoraria;
    private double Valor, ValorHoraInstrutor;

    @OneToMany(mappedBy="curso")
	private List<Turma> turmas = new ArrayList<Turma>();

	public Curso(String Sigla, String Nome){
        this.Sigla = Sigla;
        this.Nome = Nome;
    }
    
    public Curso(){
       
    }

    public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
	public void addTurma(Turma turma)
	{
		turmas.add(turma);
	}
    
    public void setDataVigencia(String DataVigencia) {
        this.DataVigencia = DataVigencia;
    }

    public void setPrograma(String Programa) {
        this.Programa = Programa;
    }

    public void setCargaHoraria(int CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public void setValorHoraInstrutor(double ValorHoraInstrutor) {
        this.ValorHoraInstrutor = ValorHoraInstrutor;
    }

    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String sigla) {
		Sigla = sigla;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getNome() {
        return Nome;
    }

    public String getDataVigencia() {
        return DataVigencia;
    }

    public String getPrograma() {
        return Programa;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public double getValor() {
        return Valor;
    }

    public double getValorHoraInstrutor() {
        return ValorHoraInstrutor;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Sigla == null) ? 0 : Sigla.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (Sigla == null) {
			if (other.Sigla != null)
				return false;
		} else if (!Sigla.equals(other.Sigla))
			return false;
		return true;
	}
    
    
    
}
