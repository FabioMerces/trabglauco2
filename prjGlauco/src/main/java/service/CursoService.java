package service;

import javax.persistence.Query;

import Entidades.Curso;

public class CursoService extends Service <Curso,Integer> {
	
	
	public Curso getCursoByNome(String Nome) {
		
		Query query = getEntityManager().
				createQuery(
			"select o from Curso o Where o.Nome = :Nome");
		query.setParameter("Nome", Nome);
		
		return  (Curso) query.getSingleResult();

		}
}
