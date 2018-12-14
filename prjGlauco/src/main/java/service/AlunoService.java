package service;

import javax.persistence.Query;

import Entidades.Aluno;

public class AlunoService extends Service <Aluno, String>{

public Aluno getAlunoByCPF(String CPF) {
		
		Query query = getEntityManager().
				createQuery(
			"select o from Aluno o Where o.CPF = :CPF");
		query.setParameter("CPF", CPF);
		
		return  (Aluno) query.getSingleResult();

		}

}
