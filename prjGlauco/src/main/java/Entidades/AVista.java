package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AVista {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Codigo;
    private double Valor;
    private int Agenda, NCheque;
    private String PreData;
    
    @ManyToOne
    private Matricula matricula;

	public void setMatricula(Matricula M){
        this.matricula = M;
    }
    
    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public void setAgenda(int Agenda) {
        this.Agenda = Agenda;
    }

    public void setNCheque(int NCheque) {
        this.NCheque = NCheque;
    }

    public void setPreData(String PreData) {
        this.PreData = PreData;
    }

	public int getCodigo() {
		return Codigo;
	}
	
    public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public double getValor() {
		return Valor;
	}

	public int getAgenda() {
		return Agenda;
	}

	public int getNCheque() {
		return NCheque;
	}

	public String getPreData() {
		return PreData;
	}

	public Matricula getMatricula() {
		return matricula;
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
		AVista other = (AVista) obj;
		if (Codigo != other.Codigo)
			return false;
		return true;
	}
	
	
}

