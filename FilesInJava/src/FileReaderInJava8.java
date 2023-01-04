import java.io.FileReader;
import java.io.IOException;

public class FileReaderInJava8 {
	public static void main(String[] args) throws IOException {
		FileReader fR = new FileReader("writes.txt");
		int read = fR.read();
		while(read != -1) {
			System.out.print(read+"==>");
			System.out.println((char)read);
			read = fR.read();
		}
	}
}
