import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*public int read() throws java.io.IOException;
public int read(char[]) throws java.io.IOException;*/
public class FileReaderInJava9 {
	public static void main(String[] args) throws IOException {
		File f = new File("writes.txt");
		FileReader fr = new FileReader(f);
		char[] ch = new char[(int)f.length()];
		//read one character and store it inside char[] 
 		fr.read(ch);
 		for(char data:ch) {
 			System.out.print(data);
 			fr.close();	
 		}
	}
}
