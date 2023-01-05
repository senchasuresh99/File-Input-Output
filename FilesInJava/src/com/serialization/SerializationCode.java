package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Dog implements Serializable{
	static {
		System.out.println("static block gets executed...");
	}

	Dog() {
		System.out.println("Object is created....");
	}

	int i = 10;
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
		System.out.println("Serialization object refernce is : "+d);
		System.out.println("Serialization ended.........");

		System.in.read();

		System.out.println("De-Serialization started.........");
		FileInputStream fis = new FileInputStream("abcde.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog)ois.readObject();
		System.out.println("De-Serialization object refernce is : "+d1);
		System.out.println("De-Serialization ended.........");
	}
}
