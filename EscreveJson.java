package Manipulacao_Dados;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreveJson  {
	public static void main (String [] args) {
		
		User1 usuario = new User1();
		usuario.setNome("agnelo");
		usuario.setLogin("admin");
		usuario.setSenha("admin");
		
		User1 usuario1 = new User1();
		usuario1.setNome("agnelo");
		usuario1.setLogin("admin");
		usuario1.setSenha("admin");
		
		
		List<User1> listadeusuario = new ArrayList<User1>();
		listadeusuario.add(usuario);
		listadeusuario.add(usuario1);
		
		/*convesão para json*/
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonUser = gson.toJson(listadeusuario);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter;
		
		try {
			/*criação de um arquivo json*/
			fileWriter = new FileWriter("C:\\Users\\angel\\eclipse-workspace\\Manipulacao_Dados\\src\\Manipulacao_Dados\\fileWrite2.json");
			fileWriter.write(jsonUser);
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//------------------ LENDO O ARQUIVO ----------------------*//
		
		FileReader filereader;
		try {
			filereader = new FileReader("C:\\Users\\angel\\eclipse-workspace\\Manipulacao_Dados\\src\\Manipulacao_Dados\\fileWrite2.json");
			JsonArray jsonArray = (JsonArray) JsonParser.parseReader(filereader);
			List<User1> listaUsuarios = new ArrayList<User1>();
			for (JsonElement fasJason : jsonArray) {
				/*incio a classe */
				
				User1 usi = new Gson().fromJson(fasJason, User1.class);
				listaUsuarios.add(usi);
				
			}

		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("leitura do aruivo JSON " + listadeusuario);
	
	}

}
