package managedbeans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import Entidades.Aluno;
import service.AlunoService;

@FacesConverter("converterAluno")
public class AlunoConverter implements Converter {

	private AlunoService servico = new AlunoService();
	
	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		
		Aluno f=null;
		if(value != null && !value.equals("")) {
			f = servico.getAlunoByCPF(value);	
		}
		
		servico.closeEntityManager();
		
		return f;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic,
			Object aluno) {
		if (aluno == null || aluno.equals("")) {
			return null;
		} else {
			return ((Aluno) aluno).getCPF();

		}
	}
	
}
