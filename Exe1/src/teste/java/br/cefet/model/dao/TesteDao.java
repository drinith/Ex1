package br.cefet.model.dao;

import javax.transaction.Transactional;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TesteDao extends TestCase {

	
	@Test
	@Transactional
	public void testeDAO(){
				
		Aluno aluno1 = new Aluno();
		aluno1.setName("Felipe");
		
		AlunoDAO.insert(aluno1);
		
		
		//Assert.assertEquals(aluno1,AlunoDAO.find(aluno1.getId()));
		
	}
	
	
}
