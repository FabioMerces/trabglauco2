package managedbeans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import Entidades.Curso;
import service.CursoService;

@FacesConverter("converterCurso")
public class CursoConverter implements Converter {

	private CursoService servico = new CursoService();
	
	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		
		Curso f=null;
		if(value != null && !value.equals("")) {
			f = servico.getCursoBySigla(value);	
		}
		
		servico.closeEntityManager();
		
		return f;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic,
			Object curso) {
		if (curso == null || curso.equals("")) {
			return null;
		} else {
			return ((Curso) curso).getSigla();

		}
	}

}
