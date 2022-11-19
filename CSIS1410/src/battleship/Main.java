package battleship;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Hello Battleship!");

	
	
	try {
        BufferedReader reader = new BufferedReader(new FileReader("/home/aleks/git/eclipse-repo/CSIS1410/res/ASCII.txt"));
        String text;
        while((text = reader.readLine()) != null) {
            System.out.println(text);
        }
        //System.out.println(reader.readLine());
        reader.close();

    } catch (IOException e) {
        e.printStackTrace();
    }

  }
}