package battleship;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import javax.print.attribute.standard.Media;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Board.Populate();
		System.out.println(Board.PrintBoard());
		
		
		
//		System.out.print("Hello Battleship!");
//	
//	
//	try {
//        BufferedReader reader = new BufferedReader(new FileReader("res/ASCII.txt"));
//        String text;
//        while((text = reader.readLine()) != null) {
//            System.out.println(text);
//        }
//        reader.close();
//
//    } catch (IOException e) {
//        e.printStackTrace();
//    }

  }

}