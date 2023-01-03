import java.io.File;
import java.io.IOException;

public class FileInJava3 {
	public static void main(String[] args) throws IOException {
		String location = "D:\\sts\\program\\FilesInJava\\CoreJava";
		File f = new File(location);
		f.mkdir();
		File f1 = new File(f,"java.txt");
		f1.createNewFile();
	}
}
