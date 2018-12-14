package Entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Turma {
	@Id
    private String SiglaTurma;
	private String Descricao, DataInicio, DataTermino, Periodo;
    private int QtdeVagas;
    private String Observacoes;

    @OneToOne
    private Instrutor instrutor;
    
    @ManyToOne
	private Curso curso;
    
    public Turma(String SiglaTurma, String Descricao) {
        this.SiglaTurma = SiglaTurma;
        this.Descricao = Descricao;
    }
    
    public Turma() {
       
    }

	@OneToMany(mappedBy="turma")
	private List<Matricula> matriculas = new ArrayList<Matricula>();
    
    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public void setDataInicio(String DataInicio) {
        this.DataInicio = DataInicio;
    }

    public void setDataTermino(String DataTermino) {
        this.DataTermino = DataTermino;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }

    public void setQtdeVagas(int QtdeVagas) {
        this.QtdeVagas = QtdeVagas;
    }

    public void setObservacoes(String Observacoes) {
        this.Observacoes = Observacoes;
    }
    
    public String getSiglaTurma() {
		return SiglaTurma;
	}

	public void setSiglaTurma(String siglaTurma) {
		SiglaTurma = siglaTurma;
	}

	public String getDescricao() {
		return Descricao;
	}

	public String getDataInicio() {
		return DataInicio;
	}

	public String getDataTermino() {
		return DataTermino;
	}

	public String getPeriodo() {
		return Periodo;
	}

	public int getQtdeVagas() {
		return QtdeVagas;
	}

	public String getObservacoes() {
		return Observacoes;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public Curso getCurso() {
		return curso;
	}
	
	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
		
    public void EmitirListaFrequencia(){
        /* Não Implementar */
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SiglaTurma == null) ? 0 : SiglaTurma.hashCode());
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
		Turma other = (Turma) obj;
		if (SiglaTurma == null) {
			if (other.SiglaTurma != null)
				return false;
		} else if (!SiglaTurma.equals(other.SiglaTurma))
			return false;
		return true;
	}
    
    
}
