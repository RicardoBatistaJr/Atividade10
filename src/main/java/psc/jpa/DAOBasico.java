package psc.jpa;

import javax.persistence.EntityManager;

public class DAOBasico {
	public static void inserir(
			Aluno pEntidade
			) {

			EntityManager em = UtilJPA.getEntityManager();

			em.getTransaction().begin();

			em.persist(pEntidade);

			em.getTransaction().commit();

			}
	
}
