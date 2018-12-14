package service;

import javax.persistence.Query;

import Entidades.Matricula;

public class MatriculaService extends Service <Matricula, Integer> {

public Matricula getMatriculaByCodigo(String Codigo) {
		
		Query query = getEntityManager().
				createQuery(
			"select o from Matricula o Where o.Codigo = :Codigo");
		query.setParameter("Codigo", Codigo);
		
		return  (Matricula) query.getSingleResult();

		}

}
