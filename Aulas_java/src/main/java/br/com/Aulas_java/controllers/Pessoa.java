package br.com.Aulas_java.controllers;

public class Pessoa {
	
	String Nome;
	int idade;
	
	public Pessoa(String Nome, int idade) {
		this.Nome = Nome;
		this.idade = idade;
		
	}
	

	
	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	
	
	 public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
