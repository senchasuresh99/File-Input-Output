import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterInJava12 {
	public static void main(String[] args) throws Exception {
		FileWriter fwr = new FileWriter("writesss.txt");
		PrintWriter pw = new PrintWriter(fwr);
		pw.write(100);
		pw.write('\n');
		pw.print(100);
		pw.println(true);
		pw.println('c');
		pw.println("Suresh");
		pw.flush();
		pw.close();
	}
}
