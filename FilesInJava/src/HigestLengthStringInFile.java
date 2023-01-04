import java.io.BufferedReader;
import java.io.FileReader;

public class HigestLengthStringInFile {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("input2.txt"));
		String readLine = br.readLine();
		int maxLength = 0;
		String result = "";
		while (readLine != null) {
			int lengthResult = readLine.length();
			if (maxLength < lengthResult) {
				maxLength = lengthResult;
				result = readLine;
			}
			readLine = br.readLine();
		}
		System.out.println("The maxLength Sting name : " + result);
		System.out.println("The maxLength Sting in a file is : " + maxLength);
	}
}
