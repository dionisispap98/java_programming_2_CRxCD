package util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;

public class DictionaryGenerator{

	public static HashSet<String> readFile(String fileName) {
		Path file = Paths.get(fileName);
		HashSet<String> dictionary = new HashSet<>();
		try {
			BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8);
			String sCurrentLine = null;
			while ((sCurrentLine =reader.readLine()) != null) {
				dictionary.add(sCurrentLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.getMessage();
		}
		return dictionary;
	}
}
