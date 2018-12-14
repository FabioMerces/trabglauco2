package service;

import javax.persistence.Query;

import Entidades.APrazo;

public class APrazoService extends Service <APrazo, String> {

public APrazo getAPrazoByCodigo(String Codigo) {
		
		Query query = getEntityManager().
				createQuery(
			"select o from APrazo o Where o.Codigo = :Codigo");
		query.setParameter("Codigo", Codigo);
		
		return  (APrazo) query.getSingleResult();

		}

}
