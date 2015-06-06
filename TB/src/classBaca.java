import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;


public class classBaca {

	void read(){
		try{
			File data = new File("Database.txt");
			FileReader read = new FileReader(data);
			BufferedReader reader = new BufferedReader(read);
			
			String readFile = null;
			
			while((readFile = reader.readLine()) != null){
				System.out.println(readFile);
			}
			
			reader.close();
		}catch(FileNotFoundException err){
			JOptionPane.showMessageDialog(null, "File Not Found!");
		}catch(IOException err){
			JOptionPane.showMessageDialog(null, "Error");
		}
	}
}
