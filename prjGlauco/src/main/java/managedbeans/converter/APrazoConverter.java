package managedbeans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import Entidades.APrazo;
import service.APrazoService;

@FacesConverter("converterAPrazo")
public class APrazoConverter implements Converter {

	private APrazoService servico = new APrazoService();
	
	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		
		APrazo f=null;
		if(value != null && !value.equals("")) {
			f = servico.getAPrazoByCodigo(value);	
		}
		
		servico.closeEntityManager();
		
		return f;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic,
			Object aPrazo) {
		if (aPrazo == null || aPrazo.equals("")) {
			return null;
		} else {
			return ((APrazo) aPrazo).getCodigo();

		}
	}
	
}
