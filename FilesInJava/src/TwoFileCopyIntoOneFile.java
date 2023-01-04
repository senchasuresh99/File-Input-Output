import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class TwoFileCopyIntoOneFile {
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("file3.txt");
		BufferedReader br=new BufferedReader(new FileReader("writess.txt"));
		String readLine = br.readLine();
		while(readLine!=null) {
			pw.println(readLine);
			readLine = br.readLine();
		}
		br = new BufferedReader(new FileReader("writesss.txt"));
		readLine = br.readLine();
		while(readLine!=null) {
			pw.println(readLine);
			readLine = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}
}
