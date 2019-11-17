package fr.akuma.mvcbuilder;

import java.io.File;
import java.io.IOException;

public class main {
	
	public static void main(String[] args) {
		File dirMVC = new File("./MVC");
		File dirModele = new File("./MVC/modele");
		File dirVue = new File("./MVC/vue");
		File dirPublic = new File("./MVC/public");
		File dirController = new File("./MVC/controller");
		File dirIncludes = new File("./MVC/includes");
		File fileRouteur = new File("./MVC/index.php");
		
		if(!dirMVC.exists()) {
			dirMVC.mkdir();
		}
		
		if(!dirModele.exists()) {
			dirModele.mkdir();
		}
		
		if(!dirVue.exists()) {
			dirVue.mkdir();
		}
		
		if(!dirPublic.exists()) {
			dirPublic.mkdir();
		}
		
		if(!dirController.exists()) {
			dirController.mkdir();
		}
		
		if(!dirIncludes.exists()) {
			dirIncludes.mkdir();
		}
		
		if(!fileRouteur.exists()) {
			try {
				fileRouteur.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
