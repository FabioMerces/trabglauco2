package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Matricula {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String Codigo;
    private String Data;
    private int QtdeFaltas;
    private double Nota;
    
    @OneToOne
    private Aluno aluno;
    
    @ManyToOne
    private Turma turma;
    
    
    public Matricula(String Data){
        this.Data = Data;
    }
    
    public Matricula(){
        
    }

    public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}


	public String getData() {
        return Data;
    }

    public void setData(String data) {
		Data = data;
	}

	public int getQtdeFaltas() {
        return QtdeFaltas;
    }

    public double getNota() {
        return Nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Turma getTurma() {
        return turma;
    }
    
    public void setAluno(Aluno a){
        this.aluno = a;
    }
    
    public void setTurma(Turma t){
        this.turma = t;
    }
    
    public void setQtdeFaltas(int QtdeFaltas) {
        this.QtdeFaltas = QtdeFaltas;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }
    
    public void EmitirCarne(){
        /*Não Implementar*/
    }



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Codigo == null) ? 0 : Codigo.hashCode());
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
		Matricula other = (Matricula) obj;
		if (Codigo == null) {
			if (other.Codigo != null)
				return false;
		} else if (!Codigo.equals(other.Codigo))
			return false;
		return true;
	}
    
    
}
