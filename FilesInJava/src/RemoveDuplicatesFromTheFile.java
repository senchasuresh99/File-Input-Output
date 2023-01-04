import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class RemoveDuplicatesFromTheFile{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter("output.txt");
		String readLine = br.readLine();
		while (readLine != null) {
			boolean isAvilable = false;
			BufferedReader br1 = new BufferedReader(new FileReader("output.txt"));
			String readLine2 = br1.readLine();
			//control comes out of while loop in smooth fashion without break
			while (readLine2 != null) {
				//if matched control should come out with break
				if (readLine2.equals(readLine)) {
					isAvilable = true;
					break;
				}
				readLine2 = br1.readLine();
			}
			if(isAvilable==false) {
				pw.println(readLine);
				pw.flush();
			}
			readLine = br.readLine();
		}
		br.close();
		pw.close();
	}
}
