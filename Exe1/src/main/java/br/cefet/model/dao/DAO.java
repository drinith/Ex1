package br.cefet.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DAO {

	protected static EntityManager em = Persistence.createEntityManagerFactory("JPAPU").createEntityManager();
	
	public static void beginTransaction(){
		em.getTransaction().begin();
	}
	
	public static void commitTransaction(){
		em.getTransaction().commit();
	}
	
	public static void rollbackTransaction(){
		em.getTransaction().rollback();
	}
	
}
