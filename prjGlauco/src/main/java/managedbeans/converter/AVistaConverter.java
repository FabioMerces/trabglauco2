package managedbeans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import Entidades.AVista;
import service.AVistaService;

@FacesConverter("converterAVista")
public class AVistaConverter implements Converter {

	private AVistaService servico = new AVistaService();
	
	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		
		AVista f=null;
		if(value != null && !value.equals("")) {
			f = servico.getAVistaByCodigo(value);	
		}
		
		servico.closeEntityManager();
		
		return f;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic,
			Object aVista) {
		if (aVista == null || aVista.equals("")) {
			return null;
		} else {
			return ((AVista) aVista).getCodigo();

		}
	}
	
}
