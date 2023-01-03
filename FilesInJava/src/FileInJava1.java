import java.io.File;
import java.io.IOException;

public class FileInJava1 {
	public static void main(String[] args) throws IOException {
		String directoryName = "IPLTeams";
		//It treats as a directory, for JVM no difference b/w directory and FileName
		File f = new File(directoryName);
		System.out.println(f.exists());
		
		f.mkdir();
		
		System.out.println();
		System.out.println(f.exists());
	}
}
