package br.cefet.model.dao;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



public class Turma {
	@OneToMany
	private List<Aluno> listaAluno;
	public List<Aluno> getListaAluno() {
		return listaAluno;
	}
	
	public void setAlunoNaLista(Aluno aluno){
		
		listaAluno.add(aluno);
	}
	
	public void setListaAluno(List<Aluno> listaAluno) {
		this.listaAluno = listaAluno;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	@Id
	@GeneratedValue
	private Long id;
	private String nomeDisciplina;
	
	
}
