package Entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Matricula {
	@Id
	private int Codigo;
    private String Data;
    private int QtdeFaltas;
    private double Nota;
    
    @OneToOne
    private Aluno aluno;
    
    @ManyToOne
    private Turma turma;
    
    @OneToMany(mappedBy="matricula")
	private List<AVista> avistas = new ArrayList<AVista>();
    
	@OneToMany(mappedBy="matricula")
	private List<APrazo> aprazos = new ArrayList<APrazo>();
    
    public Matricula(String Data){
        this.Data = Data;
    }
    
    public Matricula(){
        
    }

    public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public List<AVista> getAvistas() {
		return avistas;
	}

	public void setAvistas(List<AVista> avistas) {
		this.avistas = avistas;
	}

	public List<APrazo> getAprazos() {
		return aprazos;
	}

	public void setAprazos(List<APrazo> aprazos) {
		this.aprazos = aprazos;
	}

    public void addAPrazo(APrazo ap){
        aprazos.add(ap);
    }
    
    public void addAVista(AVista av){
        avistas.add(av);
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
		result = prime * result + Codigo;
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
		if (Codigo != other.Codigo)
			return false;
		return true;
	}
    
    
}
