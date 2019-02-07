package _02_File_Encrypt_Decrypt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.
	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("src/_02_File_Encrypt_Decrypt/test3.txt");
			int c = fr.read();
			String fileContents = "";
			while (c != -1) {
				fileContents += (char) ((c - 2) / 2);

				c = fr.read();
			}
			fr.close();
			System.out.println(fileContents);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}