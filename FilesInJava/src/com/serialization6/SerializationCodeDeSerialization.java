package com.serialization6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	String userName = "Suresh";
	transient String password = "Sencha";
}

public class SerializationCodeDeSerialization {
	public static void main(String[] args) throws Exception {
		Account acc = new Account();
		System.out.println("Serialization started.........");
		String fileName = "abcdefg.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(acc);
		System.out.println("Serialization ended.........");
		// To pause the execution till we press some key from keyboard
		System.in.read();

		System.out.println("De-Serialization started.........");
		FileInputStream fis = new FileInputStream("abcdefg.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account acc1 = (Account) ois.readObject();
		System.out.println("UserName is : "+acc1.userName);
		System.out.println("PasswordName is : "+acc1.password);
		System.out.println("De-Serialization ended.........");
	}
}
