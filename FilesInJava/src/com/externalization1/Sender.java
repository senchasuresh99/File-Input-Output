package com.externalization1;

import java.io.*;

public class Sender {
	public static void main(String[] args) throws IOException {
		Dog d = new Dog();
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
	}
}
