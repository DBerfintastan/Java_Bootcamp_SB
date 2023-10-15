package FileFunctions;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderr {
	private String file;

	public FileReaderr(String file) {
		this.file = file;
	}

	public String words(char separator) {
		StringBuilder word = new StringBuilder();
		StringBuilder result = new StringBuilder();
		try {
			FileReader reader = new FileReader(file);
			int charValue;
			while ((charValue = reader.read()) != -1) {
				char character = (char) charValue;
				if (character == separator) {
					result.append(word.toString()).append(" ");
					word.setLength(0);
				} else {
					word.append(character);
				}
			}
			if (word.length() > 0) {
				result.append(word.toString());
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result.toString();
	}

	public String lines(int lineNumber) {
		try {
			FileReader reader = new FileReader(file);
			StringBuilder line = new StringBuilder();
			int current = 0;
			int charValue;
			while ((charValue = reader.read()) != -1) {
				char character = (char) charValue;
				line.append(character);
				if (character == '\n') {
					current++;
					if (current == lineNumber) {
						reader.close();
						return line.toString();
					}
					line.setLength(0);
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
