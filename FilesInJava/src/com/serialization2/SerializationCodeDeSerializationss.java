package com.serialization2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	transient int i = 10;
	int j = 20;
}
public class SerializationCodeDeSerializationss {
	public static void main(String[] args) throws Exception {
		Dog dd = new Dog();
		System.out.println("Serialization started.........");
		String fileName = "abcdefg.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dd);
		System.out.println("Serialization ended.........");

		// To pause the execution till we press some key from keyboard
		System.in.read();

		System.out.println("De-Serialization started.........");
		FileInputStream fis = new FileInputStream("abcdefg.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog ddd = (Dog) ois.readObject();
		System.out.println("Dog object data is : " + ddd.i + "---->" + ddd.j);
		System.out.println("De-Serialization ended.........");
	}
}
