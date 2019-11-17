package fr.akuma.mvcbuilder.utils;

import java.io.File;
import java.io.IOException;

public class DirAndFileBuilder {
	
	public static void createDir(File _path) {
		if(!_path.exists()) {
			_path.mkdir();
		}
	}
	
	public static void createFile(File _path) {
		if(!_path.exists()) {
			try {
				_path.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
