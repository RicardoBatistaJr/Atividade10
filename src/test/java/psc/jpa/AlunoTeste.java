package psc.jpa;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

import psc.jpa.Aluno;

public class AlunoTeste {

	
	@Test
	public void Testeinserir() {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Arthur");
		aluno1.setCpf(1112223334);
		Aluno.inserir(aluno1);
	}
	
}
