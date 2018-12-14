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
	
	public void salvar() {
		alunoService.save(aluno);
		alunoService.closeEntityManager();
		aluno = new Aluno();
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
	
	
	public void remover() {
		alunoService.remove(aluno);
		alunoService.closeEntityManager();
		aluno = new Aluno();
	}
	
} /*
	private boolean habilitarCadastro=false; 

	public boolean ishabilitarCadastro() {
		return habilitarCadastro;
	}

	public void sethabilitarCadastro(boolean habilitarCadastro) {
		this.habilitarCadastro = habilitarCadastro;
	}

	public void salvar() {
		alunoService.save(aluno);
		alunoService.closeEntityManager();
		aluno = new Aluno();
		habilitarCadastro = false;
	}
	
	
	
	public void consultar() {
		Aluno temp;
		temp = alunoService.getById(Aluno.class, aluno.getCPF() );
		if (temp == null){
			//aluno = temp;
			habilitarCadastro = false;
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
	
}*/