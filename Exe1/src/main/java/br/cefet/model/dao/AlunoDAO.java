package br.cefet.model.dao;

public class AlunoDAO extends DAO{

	public static Aluno find (Long id){
		
		return em.find(Aluno.class,id);
		
		
	}
	
	public static void update (Aluno _aluno){
		
		em.persist(_aluno);
	}
	
	public static void insert (Aluno _aluno){
		
		em.persist(_aluno);
	}
	
}
