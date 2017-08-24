package br.cefet.view.services;

import br.cefet.model.dao.Aluno;
import br.cefet.model.dao.Turma;
import br.cefet.model.dao.TurmaDAO;

public class TurmaService {

	public static void InserirAlunoTurma(Aluno _aluno, long _turma) {
		// TODO Auto-generated method stub
		TurmaDAO.beginTransaction();
		
		Turma turma = TurmaDAO.find(_turma);
		turma.setAlunoNaLista(_aluno);
		TurmaDAO.updateTurma(turma);		
		
		TurmaDAO.commitTransaction();
		
	}

	
	
}
