package managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entidades.Curso;
import service.CursoService;

@ManagedBean
@SessionScoped

public class CursoMB {
	private Curso curso = new Curso();
	private CursoService cursoService = new CursoService();
	
	public void salvar() {
		cursoService.save(curso);
		cursoService.closeEntityManager();
		curso = new Curso();
	}
	
	public void remover() {
		cursoService.remove(curso);
		cursoService.closeEntityManager();
		curso = new Curso();
	}
	
	public List<Curso> getCursos(){
		List <Curso> lista;
		lista = cursoService.getAll(Curso.class);
		cursoService.closeEntityManager();
		return lista;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public Curso getCurso(){
		return curso;
	}
	

}
