import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterInJava10 {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("writess.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(105);
		bw.write("Neuron");
		bw.newLine();
		char[] ch = {'P','W','S','K','I','L','L','S'};
		bw.write(ch);
		bw.newLine();
		bw.write("unicorn");
		bw.flush();
		bw.close();
	}
}
