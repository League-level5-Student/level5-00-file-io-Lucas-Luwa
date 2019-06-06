package Practice_Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class File {
	public static void main(String[] args) {
		int index = 0;
		String value = JOptionPane.showInputDialog("Please enter a file location.");
		try {
			BufferedReader b = new BufferedReader(new FileReader(value));
			FileWriter fw = new FileWriter("src/Practice_Files/Result.txt");
			String line = b.readLine();
			while (line != null) {
				if (index % 2 == 0) {
					fw.write(line + "\n");
				}
				// Debugging SYSO
				// System.out.print(line + "\n");
				line = b.readLine();
				index += 1;
			}
			b.close();
			fw.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Your file wasn't found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
