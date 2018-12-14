package managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entidades.Turma;
import Entidades.Curso;
import Entidades.Instrutor;
import service.CursoService;
import service.TurmaService;
import service.InstrutorService;

@ManagedBean
@SessionScoped

public class TurmaMB {
	private Turma turma = new Turma();
	private TurmaService turmaService = new TurmaService();
	private CursoService cursoService = new CursoService();
	private Curso curso;
	private InstrutorService instrutorService = new InstrutorService();
	private Instrutor instrutor;	
	
	
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
	
	public List<Instrutor> getInstrutors(){
		List <Instrutor> list = instrutorService.getAll(Instrutor.class);
		instrutorService.closeEntityManager();
		return list;
	}	
	
	public Instrutor getInstrutor() {
		return instrutor;
	}	
	
	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}
	
	public void salvar() {
		turma.setCurso(curso);
		turma.setInstrutor(instrutor);
		turmaService.save(turma);
		turmaService.closeEntityManager();
		turma = new Turma();
		instrutor = null;
		curso = null;
	}
	
	public void remover() {
		turmaService.remove(turma);
		turmaService.closeEntityManager();
		turma = new Turma();
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
