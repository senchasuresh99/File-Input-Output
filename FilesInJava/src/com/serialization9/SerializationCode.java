package com.serialization9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable {
	int i = 10;
}
class Dog extends Animal{
	int j = 20;
}

public class SerializationCode {
	public static void main(String[] args) throws Exception {
		Dog d = new Dog();
		System.out.println("Serialization started.........");
		String fileName = "abcde.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Serialization ended.........");

		System.in.read();

		System.out.println("De-Serialization started.........");
		FileInputStream fis = new FileInputStream("abcde.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog)ois.readObject();
		System.out.println(d1.i+"---------->"+d1.j);
		System.out.println("De-Serialization ended.........");
	}
}
