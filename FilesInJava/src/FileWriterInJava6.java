import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterInJava6 {
	public static void main(String[] args) throws IOException {
		File f = new File("write.txt");
		FileWriter fW = new FileWriter(f);
		fW.write("\n");
		fW.write(97);
		fW.write("\n");
		fW.write("Suresh Sencha");
		char [] ch = {'P','W','S','K','I','L','L','S'};
		fW.write("\n");
		fW.write(ch);
		
		fW.close();
	}
}
