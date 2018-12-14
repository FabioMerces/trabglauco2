package service;

import javax.persistence.Query;

import Entidades.AVista;

public class AVistaService extends Service <AVista, String> {

public AVista getAVistaByCodigo(String Codigo) {
		
		Query query = getEntityManager().
				createQuery(
			"select o from AVista o Where o.Codigo = :Codigo");
		query.setParameter("Codigo", Codigo);
		
		return  (AVista) query.getSingleResult();

		}

}
