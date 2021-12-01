package ArquivosJava;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Aluno.Usuario;

public class EscreveJSON {

	public static void main(String[] args) throws Exception {
		
		Usuario usuario1 = new Usuario();
		usuario1.setCpf("45678126");
		usuario1.setLogin("Gustavo");
		usuario1.setSenha("123456");
		usuario1.setNome("Gustavo");

		
		Usuario usuario2 = new Usuario();
		usuario2.setCpf("123456789");
		usuario2.setLogin("Barbara");
		usuario2.setSenha("12345");
		usuario2.setNome("Bárbara");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter
				("C:\\Users\\dougl\\git\\Pessoas\\Pessoas\\src\\ArquivosJava\\filjson.json");
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
	}

}
