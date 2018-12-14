package service;

import javax.persistence.Query;

import Entidades.Turma;

public class TurmaService extends Service <Turma,Integer> {

public Turma getTurmaBySiglaTurma(String SiglaTurma) {
		
		Query query = getEntityManager().
				createQuery(
			"select o from Turma o Where o.SiglaTurma = :SiglaTurma");
		query.setParameter("SiglaTurma", SiglaTurma);
		
		return  (Turma) query.getSingleResult();

		}

}
