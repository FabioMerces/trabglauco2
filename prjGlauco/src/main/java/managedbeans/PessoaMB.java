package managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entidades.Pessoa;
import service.PessoaService;

@ManagedBean
@SessionScoped

public class PessoaMB {
	private Pessoa pessoa = new Pessoa();
	private PessoaService pessoaService = new PessoaService();
	
	public void salvar() {
		pessoaService.save(pessoa);
		pessoaService.closeEntityManager();
		pessoa = new Pessoa();
	}
	
	public List<Pessoa> getPessoas(){
		List <Pessoa> lista;
		lista = pessoaService.getAll(Pessoa.class);
		pessoaService.closeEntityManager();
		return lista;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public Pessoa getPessoa(){
		return pessoa;
	}

}



