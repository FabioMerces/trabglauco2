package managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entidades.Instrutor;
import service.InstrutorService;

@ManagedBean
@SessionScoped

public class InstrutorMB {
	private Instrutor instrutor = new Instrutor();
	private InstrutorService instrutorService = new InstrutorService();
	
	public void salvar() {
		instrutorService.save(instrutor);
		instrutorService.closeEntityManager();
		instrutor = new Instrutor();
	}
	
	public void remover() {
		instrutorService.remove(instrutor);
		instrutorService.closeEntityManager();
		instrutor = new Instrutor();
	}
	
	public List<Instrutor> getInstrutores(){
		List <Instrutor> lista;
		lista = instrutorService.getAll(Instrutor.class);
		instrutorService.closeEntityManager();
		return lista;
	}
	
	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}
	
	public Instrutor getInstrutor(){
		return instrutor;
	}

}
