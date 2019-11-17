package fr.akuma.mvcbuilder;

import java.io.File;
import java.io.IOException;

public class main {
	
	public static void main(String[] args) {
		File dirModele = new File("./modele");
		File dirVue = new File("./vue");
		File dirPublic = new File("./public");
		File dirController = new File("./controller");
		File dirIncludes = new File("./includes");
		File fileRouteur = new File("./index.php");
		
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
