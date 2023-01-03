import java.io.File;
import java.io.IOException;

public class FileInJava2 {
	public static void main(String[] args) throws IOException {
		File f = new File("IPLTeamsFinal");
		f.mkdir();
		System.out.println("Is f pointing to a Directory : "+f.isDirectory());
		File f1 = new File(f,"abc.txt");
		f1.createNewFile();
		System.out.println("Is f1 pointing to a file : "+f1.isFile());
	}
}
