package psc.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno extends DAOBasico {


	@Id
	long cpf;
	String nome;

	public Aluno() {
		this.cpf= 0;
		this.nome = "";
	}
	
	public long getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public void inserir() {
		
	}
	
	
	
}
