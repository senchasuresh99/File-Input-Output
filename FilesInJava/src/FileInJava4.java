import java.io.File;
import java.io.IOException;

public class FileInJava4 {
	public static void main(String[] args) throws IOException {
		/*
		 * public long length();//no of characters present in file public boolean
		 * delete();//it delete file or directory based on file object public String []
		 * list();//it return the name of all files and directory under specified
		 * directory
		 */	
			int dirCount = 0;
			int fileCount = 0;
			String location = "D:\\ImServerT-2\\ImServerT";
			File f = new File(location);
			
			String[] list = f.list();
			for(String name:list) {
				//Creating a file object for f->(directory)
				//using f->filename
				File f1 = new File(f,name);
				if(f1.isDirectory()) {
					dirCount++;
				}
				if(f1.isFile()) {
					fileCount++;
				}
				//count++;
				System.out.println(name);
			}
			System.out.println("Total no of Directory is : "+dirCount);
			System.out.println("Total no of files is : "+fileCount);
		}
}
