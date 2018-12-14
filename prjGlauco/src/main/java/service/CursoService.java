package service;

import javax.persistence.Query;

import Entidades.Curso;

public class CursoService extends Service <Curso,Integer> {
	
	
	public Curso getCursoBySigla(String Sigla) {
		
		Query query = getEntityManager().
				createQuery(
			"select o from Curso o Where o.Sigla = :Sigla");
		query.setParameter("Sigla", Sigla);
		
		return  (Curso) query.getSingleResult();

		}
}
