package br.com.Aulas_java.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javassist.expr.NewArray;

interface OperacaoMatematica{
	int Calcular(int a, int b);
}

interface ManipuladorString{
	String Manipular(String str);
}


/*CONCEITO LAMBDA */
public class Lambda {
	/* (PARAMETROS) ->  EXPRESSÕESS
	 * (PARAMETROS) -> {BLOCO DE CODIGO}*/
	
	public static void main(String[] args) {
		/*SEM LAMBDA*/
		OperacaoMatematica operacao = new OperacaoMatematica() {
			
			@Override
			public int Calcular(int a, int b) {
				
				return a + b;
			}		
		};
		System.out.println (operacao.Calcular(4, 5));	
		
		/*COM LAMBDA*/
		/*INTERFACE + EXPRESSÃO PARAMETROS + SETA + RETORNO */
		OperacaoMatematica opera = (a, b) -> a + b;
		System.out.println (opera.Calcular(5, 9));
		
		/*MANIPULAÇÃO DE STRING*/
		/*SEM LAMBDA*/
		ManipuladorString Manipulado = new ManipuladorString() {
			
			@Override
			public String Manipular(String str) {
				// TODO Auto-generated method stub
				return str.toUpperCase();
			}

		};
		System.out.println(Manipulado.Manipular("cachorro"));
		
		/*COM LAMBDA*/
		ManipuladorString Manipul = (str) -> str.toUpperCase();
		System.out.println (Manipul.Manipular("pequenino"));
		
		/*USANDO O FILTRO*/
		
		/*asList LISTA NÃO MODIFICAVEL*/
		List<String> palavras = Arrays.asList("caju", "manga", "doce");
		
		/*LISTA MODIFICAVEL*/
		List<String> palavrasFil = new ArrayList<>();
		
		for(String palavra:palavras){
			if(palavra.length() > 3) {
				palavrasFil.add(palavra);
			}
			
		}
		
		System.out.println("palavras com mais de 5 palavras " + palavrasFil);
		
		/*---- LISTA FILTRO --------- * ESTA PARTE EO FOR **************** ESTA PARTE E O IF * ESTA PARTE E O ADD */
		List<String> palavrasFiltro = palavras.stream().filter(palavra -> palavra.length() > 4).toList();
		
		System.out.println("palavras com mais de 5 palavras " + palavrasFiltro);

		/*FILTRO COM OBJETOS*/
		
		List<Pessoa> pessoas = Arrays.asList(
			new Pessoa("alice",58),
			new Pessoa("fulano",55),
			new Pessoa("beltrano",21),
			new Pessoa("jose",24),
			new Pessoa("aline",35)
			
		);
		/*USO DE LAMBDA COM MAP E STREAM*/
		
		/********************PARAMETROS******************** EXPRESSÃO*******************/
		List<String> nomes = pessoas.stream().map(pessoa -> pessoa.getNome()).toList();
		List<Integer> idade = pessoas.stream().map(pessoa -> pessoa.getIdade()).toList();

		System.out.println("LISTA DE NOMES " + nomes + " LISTA DE IDADES " + idade);
		

		
	}
}
