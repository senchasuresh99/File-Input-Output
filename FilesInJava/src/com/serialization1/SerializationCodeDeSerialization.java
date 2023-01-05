package com.serialization1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	static {
		System.out.println("Dog static block gets executed...");
	}

	Dog() {
		System.out.println("Dog Object is created....");
	}

	int i = 10;
	int j = 20;
}

class Cat implements Serializable {
	static {
		System.out.println("Cat static block gets executed...");
	}

	Cat() {
		System.out.println("Cat Object is created....");
	}

	int i = 100;
	int j = 200;
}

public class SerializationCodeDeSerialization {
	public static void main(String[] args) throws Exception {
		Dog d = new Dog();
		Cat c = new Cat();
		System.out.println("Serialization started.........");
		String fileName = "abcdef.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.writeObject(c);
		System.out.println("Serialization object refernce is : " + d);
		System.out.println("Serialization ended.........");

		// To pause the execution till we press some key from keyboard
		System.in.read();

		System.out.println("De-Serialization started.........");
		FileInputStream fis = new FileInputStream("abcdef.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog) ois.readObject();
		Cat c1 = (Cat) ois.readObject();
		System.out.println("Dog object data is : " + d1.i + "---->" + d1.j);
		System.out.println("Dog object data is : " + c1.i + "---->" + c1.j);
		System.out.println("De-Serialization ended.........");
	}
}
