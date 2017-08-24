package br.cefet.view.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.cefet.model.dao.Aluno;

import br.cefet.view.services.TurmaService;

public class InsertAlunoTurmaCommand implements Command {

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String nome = (String) request.getAttribute("nome");
		Long turma = Long.parseLong((String) request.getAttribute("turmaId"));
			
		
		Aluno aluno = new Aluno();
		aluno.setName(nome);
				
		TurmaService.InserirAlunoTurma(aluno,turma);
	}

}
