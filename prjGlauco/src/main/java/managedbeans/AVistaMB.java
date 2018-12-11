package managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entidades.AVista;
import service.AVistaService;

@ManagedBean
@SessionScoped

public class AVistaMB {
	private AVista avista = new AVista();
	private AVistaService avistaService = new AVistaService();
	
	public void salvar() {
		avistaService.save(avista);
		avistaService.closeEntityManager();
		avista = new AVista();
	}
	
	public List<AVista> getAVistas(){
		List <AVista> lista;
		lista = avistaService.getAll(AVista.class);
		avistaService.closeEntityManager();
		return lista;
	}
	
	public void setAVista(AVista avista) {
		this.avista = avista;
	}
	
	public AVista getAVista(){
		return avista;
	}

}
