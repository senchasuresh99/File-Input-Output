import java.io.*;

public class FileInJava5 {
	public static void main(String[] args) {
		int dirCount = 0;
		int fileCount = 0;
		int jpgCount = 0;
		int javaCount = 0;
		int pngCount = 0;
		int zipCount = 0;
		int txtCount = 0;
		String location = "D:\\sts";
		File f = new File(location);
		
		String[] list = f.list();
		for(String name:list) {
			File f1 = new File(f,name);
			if(f1.isDirectory()) {
				dirCount++;
			}
			if(f1.isFile()) {
				
				if(name.endsWith(".jpg")) {
					jpgCount++;
				}
				if(name.endsWith(".java")) {
					javaCount++;
				}
				if(name.endsWith(".png")) {
					pngCount++;
				}
				if(name.endsWith(".zip")) {
					zipCount++;
				}
				if(name.endsWith(".txt")) {
					txtCount++;
				}
				fileCount++;
			}
			System.out.println(name);
		}
		System.out.println("Total no of jpgCount is : "+jpgCount);
		System.out.println("Total no of javaCount is : "+javaCount);
		System.out.println("Total no of pngCount is : "+pngCount);
		System.out.println("Total no of zipCount is : "+zipCount);
		System.out.println("Total no of txtCount is : "+txtCount);
		System.out.println("Total no of Directory is : "+dirCount);
		System.out.println("Total no of files is : "+fileCount);
	}
}

