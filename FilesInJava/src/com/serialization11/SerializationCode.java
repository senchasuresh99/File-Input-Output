package com.serialization11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal {
	int i = 10;

	Animal(int i) {//Exception in thread "main" java.io.InvalidClassException: com.serialization11.Dog; no valid constructor
		System.out.println("Animal constructor colled.....");
	}
}

class Dog extends Animal implements Serializable {
	int j = 20;

	Dog() {
		super(10);
		System.out.println("Dog constructor colled.....");
	}
}

public class SerializationCode {
	public static void main(String[] args) throws Exception {
		Dog d = new Dog();
		d.i = 888;
		d.j = 999;
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
		Dog d1 = (Dog) ois.readObject();
		System.out.println(d1.i + "---------->" + d1.j);
		System.out.println("De-Serialization ended.........");
	}
}
