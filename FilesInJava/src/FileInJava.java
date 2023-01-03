import java.io.File;
import java.io.IOException;

public class FileInJava {
	public static void main(String[] args) throws IOException {
		String fileName = "abc.txt";
		//This line will check wither the file called "abc.txt" exists or not
		//If it is available then it would go and point to that file
		//otherwise it will represent a java file object, not a physical file.
		File f = new File(fileName);
		System.out.println(f.exists());
		//it will create a physical file if the file does not exists for the 
		//java file object
		f.createNewFile();
		System.out.println(f.exists());
	}
}
