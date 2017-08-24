package br.cefet.model.dao;

public class TurmaDAO extends DAO {

	public static Turma find(Long id){
		
		 Turma turma =em.find(Turma.class, id);
		return 	turma;
	}

	public static void updateTurma(Turma turma) {
		
		em.persist(turma);
	}
	
}
