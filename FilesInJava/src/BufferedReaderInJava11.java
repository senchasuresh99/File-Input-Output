import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderInJava11 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("writess.txt");
		BufferedReader br = new BufferedReader(fr);
		String readLine = br.readLine();
		while(readLine != null) {
			System.out.println(readLine);
			readLine = br.readLine();
		}
		br.close();
	}
}
