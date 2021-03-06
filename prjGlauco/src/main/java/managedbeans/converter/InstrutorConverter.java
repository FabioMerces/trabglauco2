package managedbeans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import Entidades.Instrutor;
import service.InstrutorService;

@FacesConverter("converterInstrutor")
public class InstrutorConverter implements Converter {

	private InstrutorService servico = new InstrutorService();
	
	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		
		Instrutor f=null;
		if(value != null && !value.equals("")) {
			f = servico.getInstrutorByCPF(value);	
		}
		
		servico.closeEntityManager();
		
		return f;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic,
			Object instrutor) {
		if (instrutor == null || instrutor.equals("")) {
			return null;
		} else {
			return ((Instrutor) instrutor).getCPF();

		}
	}
	
}
