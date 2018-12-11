package managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entidades.Turma;
import Entidades.Curso;
import service.CursoService;
import service.TurmaService;

@ManagedBean
@SessionScoped

public class TurmaMB {
	private Turma turma = new Turma();
	private TurmaService turmaService = new TurmaService();
	private CursoService cursoService = new CursoService();
	private Curso curso;	
	
	
	public List<Curso> getCursos(){
		List <Curso> list = cursoService.getAll(Curso.class);
		cursoService.closeEntityManager();
		return list;
	}	
	
	public Curso getCurso() {
		return curso;
	}	
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public void salvar() {
		turma.setCurso(curso);
		turmaService.save(turma);
		turmaService.closeEntityManager();
		turma = new Turma();
		curso = null;
	}
	
	public List<Turma> getTurmas(){
		List <Turma> lista;
		lista = turmaService.getAll(Turma.class);
		turmaService.closeEntityManager();
		return lista;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public Turma getTurma(){
		return turma;
	}

}
