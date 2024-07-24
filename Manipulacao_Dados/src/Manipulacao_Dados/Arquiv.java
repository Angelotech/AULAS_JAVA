package Manipulacao_Dados;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Arquiv {

public static void main(String[] args) {
		
		Dados dados = new Dados();
		
		dados.setNome("andre");
		dados.setIdade(25);
		dados.setCpf("709999999");
		dados.setPais("frança");
		
		Dados dados1 = new Dados();
		
		dados1.setNome("luiz");
		dados1.setIdade(40);
		dados1.setCpf("10222222");
		dados1.setPais("inglaterra");
		
		List<Dados> Cadrastro = new ArrayList<>();
		Cadrastro.add(dados1);
		Cadrastro.add(dados);
		
		String jsonUser = new Gson().toJson(Cadrastro);
		
		System.out.println(jsonUser);
		
		

 }
}