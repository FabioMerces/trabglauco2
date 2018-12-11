package managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entidades.Matricula;
import service.MatriculaService;

@ManagedBean
@SessionScoped

public class MatriculaMB {
	private Matricula matricula = new Matricula();
	private MatriculaService matriculaService = new MatriculaService();
	
	public void salvar() {
		matriculaService.save(matricula);
		matriculaService.closeEntityManager();
		matricula = new Matricula();
	}
	
	public List<Matricula> getMatriculas(){
		List <Matricula> lista;
		lista = matriculaService.getAll(Matricula.class);
		matriculaService.closeEntityManager();
		return lista;
	}
	
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	
	public Matricula getMatricula(){
		return matricula;
	}


}
