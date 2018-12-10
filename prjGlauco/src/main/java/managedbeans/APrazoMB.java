package managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entidades.APrazo;
import service.APrazoService;

@ManagedBean
@SessionScoped
public class APrazoMB {
	private APrazo aprazo = new APrazo();
	private APrazoService aprazoService = new APrazoService();
	
	public void salvar() {
		aprazoService.save(aprazo);
		aprazoService.closeEntityManager();
		aprazo = new APrazo();
	}
	
	public List<APrazo> getAPrazos(){
		List <APrazo> lista;
		lista = aprazoService.getAll(APrazo.class);
		aprazoService.closeEntityManager();
		return lista;
	}
	
	public void setAPrazo(APrazo aprazo) {
		this.aprazo = aprazo;
	}
	
	public APrazo getAPrazo(){
		return aprazo;
	}

}
