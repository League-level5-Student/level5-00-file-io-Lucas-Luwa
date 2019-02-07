package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file

	public static void main(String[] args) {
		String yEncrypted = "";
		String y = JOptionPane.showInputDialog("Give a message!");

		for (int i = 0; i < y.length(); i++) {
			yEncrypted += (char) (y.charAt(i) * 2 + 2);
		}
		System.out.println(yEncrypted);

		try {
			FileWriter fw = new FileWriter("src/_02_File_Encrypt_Decrypt/test3.txt");
			// fw.write("\nThis is me writing a message");
			fw.write("" + yEncrypted);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
