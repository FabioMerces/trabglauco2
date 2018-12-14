package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class APrazo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String Codigo;
    private double Valor, TaxaJuros;
    private int QtdeMensalidade;
    private String DtVencimento;
    
/*
	public void setMatricula(Matricula M){
        this.matricula = M;
    }
	public Matricula getMatricula() {
		return matricula;
	}
    */
    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public void setTaxaJuros(double TaxaJuros) {
        this.TaxaJuros = TaxaJuros / 100;
    }

    public void setQtdeMensalidade(int QtdeMensalidade) {
        this.QtdeMensalidade = QtdeMensalidade;
    }

    public void setDtVencimento(String DtVencimento) {
        this.DtVencimento = DtVencimento;
    }
    
	public String getCodigo() {
		return Codigo;
	}
	
    public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public double getValor() {
		return Valor;
	}

	public double getTaxaJuros() {
		return TaxaJuros;
	}

	public int getQtdeMensalidade() {
		return QtdeMensalidade;
	}

	public String getDtVencimento() {
		return DtVencimento;
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
		APrazo other = (APrazo) obj;
		if (Codigo == null) {
			if (other.Codigo != null)
				return false;
		} else if (!Codigo.equals(other.Codigo))
			return false;
		return true;
	}


	
	
}
