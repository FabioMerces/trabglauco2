package managedbeans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import Entidades.Matricula;
import service.MatriculaService;

@FacesConverter("converterMatricula")
public class MatriculaConverter implements Converter {

	private MatriculaService servico = new MatriculaService();
	
	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		
		Matricula f=null;
		if(value != null && !value.equals("")) {
			f = servico.getMatriculaByCodigo(value);	
		}
		
		servico.closeEntityManager();
		
		return f;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic,
			Object matricula) {
		if (matricula == null || matricula.equals("")) {
			return null;
		} else {
			return ((Matricula) matricula).getCodigo();

		}
	}
	
}
