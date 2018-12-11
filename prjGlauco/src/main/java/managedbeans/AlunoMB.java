package managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entidades.Aluno;
import service.AlunoService;

@ManagedBean
@SessionScoped
public class AlunoMB {
	private Aluno aluno = new Aluno();
	private AlunoService alunoService = new AlunoService();
	private boolean habilitarConsulta=true; 

	public boolean isHabilitarConsulta() {
		return habilitarConsulta;
	}

	public void setHabilitarConsulta(boolean habilitarConsulta) {
		this.habilitarConsulta = habilitarConsulta;
	}

	public void salvar() {
		alunoService.save(aluno);
		alunoService.closeEntityManager();
		aluno = new Aluno();
	}
	
	public void remover() {
		alunoService.remove(aluno);
		alunoService.closeEntityManager();
		aluno = new Aluno();
	}
	
	public void consultar() {
		Aluno temp;
		temp = alunoService.getById(Aluno.class, aluno.getCPF() );
		if (temp != null){
			aluno = temp;
			habilitarConsulta = false;
		}
		
	}
	
	public List<Aluno> getAlunos(){
		List <Aluno> lista;
		lista = alunoService.getAll(Aluno.class);
		alunoService.closeEntityManager();
		return lista;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Aluno getAluno(){
		return aluno;
	}
	
}