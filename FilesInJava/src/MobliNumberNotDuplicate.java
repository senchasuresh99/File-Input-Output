import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class MobliNumberNotDuplicate {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("input1.txt"));
		PrintWriter pw = new PrintWriter("output1.txt");
		String readLine = br.readLine();
		while (readLine != null) {
			boolean isAvilable = false;
			BufferedReader br1 = new BufferedReader(new FileReader("delete.txt"));
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
