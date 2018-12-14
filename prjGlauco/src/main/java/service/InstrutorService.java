package service;

import javax.persistence.Query;

import Entidades.Instrutor;

public class InstrutorService extends Service <Instrutor,Integer> {

public Instrutor getInstrutorByCPF(String CPF) {
		
		Query query = getEntityManager().
				createQuery(
			"select o from Instrutor o Where o.CPF = :CPF");
		query.setParameter("CPF", CPF);
		
		return  (Instrutor) query.getSingleResult();

		}

}
