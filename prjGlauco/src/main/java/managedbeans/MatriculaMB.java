package managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entidades.Aluno;
import Entidades.Turma;
import Entidades.Matricula;
import service.AlunoService;
import service.MatriculaService;
import service.TurmaService;

@ManagedBean
@SessionScoped

public class MatriculaMB {
	private Matricula matricula = new Matricula();
	private MatriculaService matriculaService = new MatriculaService();
	private AlunoService alunoService = new AlunoService();
	private Aluno aluno;
	private TurmaService turmaService = new TurmaService();
	private Turma turma;
	
	public void salvar() {
		matricula.setAluno(aluno);
		matricula.setTurma(turma);
		matriculaService.save(matricula);
		matriculaService.closeEntityManager();
		matricula = new Matricula();
		turma = null;
		aluno = null;
	}
	
	public void remover() {
		matriculaService.remove(matricula);
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

	public List<Aluno> getAlunos(){
		List <Aluno> list = alunoService.getAll(Aluno.class);
		alunoService.closeEntityManager();
		return list;
	}	
	
	public Aluno getAluno() {
		return aluno;
	}	
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public List<Turma> getTurmas(){
		List <Turma> list = turmaService.getAll(Turma.class);
		turmaService.closeEntityManager();
		return list;
	}	
	
	public Turma getTurma() {
		return turma;
	}	
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}
