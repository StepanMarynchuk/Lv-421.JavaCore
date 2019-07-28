package homeWork10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainIO {

	public static void main(String[] args) {
		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter("file1.txt"));
//			bw.write("new file");
//			bw.close();
			BufferedReader brFileReader = new BufferedReader(new FileReader("file1.txt"));
			List <String> text = new ArrayList<String>();
			String lineText;
			while ((lineText = brFileReader.readLine()) != null) {
				text.add(lineText);
			}
			brFileReader.close();
			String lineLongest = "";
			int numLine = 0;
			for (String string : text) {
				numLine++;
				if (lineLongest.length() < string.length()) {lineLongest = string;}
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"));
			bw.write("the number of lines in file1.txt is - "+ numLine);
			bw.newLine();
			bw.write(lineLongest);
			bw.newLine();
			bw.write("Yura 04.10.1987");			
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
