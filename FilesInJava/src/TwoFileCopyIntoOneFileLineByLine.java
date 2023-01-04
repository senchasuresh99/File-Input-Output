import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class TwoFileCopyIntoOneFileLineByLine {
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("file4.txt");
		BufferedReader br=new BufferedReader(new FileReader("writess.txt"));
		String readLine = br.readLine();
		BufferedReader br1 = new BufferedReader(new FileReader("writesss.txt"));
		String readLine1 = br1.readLine();
		while(readLine!=null || readLine1!=null) {
			if(readLine!=null) {
				pw.println(readLine);
				readLine = br.readLine();
			}
			
			if(readLine1!=null) {
				pw.println(readLine1);
				readLine1 = br1.readLine();
			}
		}
		br.close();
		br1.close();
		pw.close();
	}
}
