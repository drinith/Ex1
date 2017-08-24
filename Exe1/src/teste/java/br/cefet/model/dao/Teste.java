package br.cefet.model.dao;

public class Teste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setName("Felipe");
		
		AlunoDAO.beginTransaction();
		
		AlunoDAO.insert(aluno1);
		
		AlunoDAO.commitTransaction();
		
		
		
		
	}
}
