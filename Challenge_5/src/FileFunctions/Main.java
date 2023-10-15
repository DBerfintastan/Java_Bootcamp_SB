package FileFunctions;

public class Main {

	public static void main(String[] args) {
		FileReaderr fileReader = new FileReaderr("dosya.txt");
		String words = fileReader.words(' ');
		String line = fileReader.lines(4);
		System.out.println("Kelimeler: " + words);
		System.out.println("-------------------------------------");
		System.out.println("Satır 4: " + line);

	}

}
