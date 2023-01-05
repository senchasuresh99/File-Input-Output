package com.serialization8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	String userName = "Suresh";
	transient String password = "Sencha";
	transient int pin = 4444;

	// write a logic of Serialization
	private void writeObject(ObjectOutputStream oos) throws IOException {
		System.out.println("writeObject method is called.....");
		// perform Default Serialization
		oos.defaultWriteObject();
		// perform encryption
		String encypwd = "123" + password;
		int encypin = 1111 + pin;
		// write the encrypted data as object to Serialized file
		oos.writeObject(encypwd);
		oos.writeInt(encypin);
	}

	// write a logic of DeSerialization
	private void readObject(ObjectInputStream ois) throws Exception {
		System.out.println("readObject method is called.....");
		// perform Default DeSerialization
		ois.defaultReadObject();
		// read encrypted data from Serialized file
		String encypwd = (String) ois.readObject();
		int encypin = ois.readInt();
		// perform decryption and attach it to instance variable
		password = encypwd.substring(3);
		pin = encypin - 1111;
	}
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
		System.out.println("UserName  is    : " + acc1.userName);
		System.out.println("PasswordName is : " + acc1.password);
		System.out.println("Pin          is : " + acc1.pin);
		System.out.println("De-Serialization ended.........");
	}
}
