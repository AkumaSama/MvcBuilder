package fr.akuma.mvcbuilder;

import java.io.File;
import java.util.ArrayList;

import fr.akuma.mvcbuilder.utils.DirAndFileBuilder;

public class main {
	
	public static void main(String[] args) {
		File dirMVC = new File("./MVC");
		File dirModele = new File("./MVC/modele");
		File dirVue = new File("./MVC/vue");
		File dirPublic = new File("./MVC/public");
		File dirPublicImage = new File("./MVC/public/image");
		File dirPublicCSS = new File("./MVC/public/css");
		File filePublicCSS = new File("./MVC/public/css/style.css");
		File dirPublicJS = new File("./MVC/public/js");
		File filePublicJS = new File("./MVC/public/js/file.js");
		File dirPublicFile = new File("./MVC/public/file");
		File dirController = new File("./MVC/controller");
		File dirIncludes = new File("./MVC/includes");
		File fileRouteur = new File("./MVC/index.php");
		File fileVue = new File("./MVC/vue/V_sample.php");
		File fileModele = new File("./MVC/mdoele/M_sample.php");
		File fileController = new File("./MVC/controller/C_sample.php");
		
		ArrayList<File> allDir = new ArrayList<File>();
		ArrayList<File> allFile = new ArrayList<File>();
		allDir.add(dirMVC);
		allDir.add(dirModele);
		allDir.add(dirVue);
		allDir.add(dirPublic);
		allDir.add(dirPublicImage);
		allDir.add(dirPublicCSS);
		allDir.add(dirPublicJS);
		allDir.add(dirPublicFile);
		allDir.add(dirController);
		allDir.add(dirIncludes);
		
		allFile.add(filePublicCSS);
		allFile.add(fileRouteur);
		allFile.add(filePublicJS);
		allFile.add(fileVue);
		allFile.add(fileModele);
		allFile.add(fileController);
		
		for(File f : allDir){
			DirAndFileBuilder.createDir(f);
		}
		
		for(File f : allFile){
			DirAndFileBuilder.createFile(f);
		}	
	}
}
