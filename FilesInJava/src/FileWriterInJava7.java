import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterInJava7 {
	public static void main(String[] args) throws IOException {
		File f = new File("writes.txt");
		//appending file
		FileWriter fW = new FileWriter(f,true);
		fW.write("\n");
		fW.write(97);
		fW.write("\n");
		fW.write("Suresh Sencha");
		char [] ch = {'P','W','S','K','I','L','L','S'};
		fW.write("\n");
		fW.write(ch);
		//making the data to write to the File
		fW.flush();
		fW.close();
		System.out.println("opne writes.txt to see the output");
	}
}
