package com.serialization5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	Cat c = new Cat();
}

class Cat implements Serializable {
	Rat r = new Rat();
}

class Rat implements Serializable {
	int j = 20;
}

public class SerializationCodeDeSerialization {
	public static void main(String[] args) throws Exception {
		Dog d = new Dog();
		System.out.println("Serialization started.........");
		String fileName = "abcdefg.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Serialization ended.........");
		// To pause the execution till we press some key from keyboard
		System.in.read();

		System.out.println("De-Serialization started.........");
		FileInputStream fis = new FileInputStream("abcdefg.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog) ois.readObject();
		System.out.println(d1.c.r.j);
		System.out.println("De-Serialization ended.........");
	}
}
