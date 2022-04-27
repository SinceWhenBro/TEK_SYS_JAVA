package fileIOProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//absolute path
		//relative path Java Files and Java IO Slide 7
		
		//=================byte streams=======================
		
//		FileInputStream in = null;
//		FileOutputStream out = null;
//		
//		try {
//		in = new FileInputStream("input.txt");
//		out = new FileOutputStream("output.txt");
//		int num;
//		
//		while((num = in.read())  !=-1) {
//			out.write(num);
//		}
//		}finally {
//			if(in != null) {
//				in.close();
//				System.out.println("ran in");
//			}
//			if(out != null) {
//				out.close();
//				System.out.println("ran out");
//			}
//		}
		
	
		//=================char streams====================
		
//		FileReader in = null;
//		FileWriter out = null;
//		
//		try {
//			in = new FileReader("input.txt");
//			out = new FileWriter("output.txt");
//			int num;
//			
//			while((num = in.read())  !=-1) {
//				out.write(num);
//			}
//			}finally {
//				if(in != null) {
//					in.close();
//					System.out.println("ran in");
//				}
//				if(out != null) {
//					out.close();
//					System.out.println("ran out");
//				}
//			}
		
		//=================standard streams==================
		
//		InputStreamReader streamIn = null;
//		OutputStreamWriter streamOut = null;
//		
//		try {
//			streamIn = new InputStreamReader(System.in);
//			System.out.println("Enter Q to quit!");
//			
//			char Q;
//			do {
//				Q = (char) streamIn.read();
//				System.out.println(Q);
//			}while(Q != 'Q');	
//			
//		}finally {
//			if(streamIn != null) {
//				streamIn.close();
//			}
//		}
			
			
			
		//=============reading and writing two files=======
		
		String path = "newfile.CSV";
		
		try {
			//create file obj
		File file = new File(path);
		//scanner to read this file and print it out in console 
		Scanner input = new Scanner(file);
		//creating ArrayList using the obj of Course
		ArrayList<Course> data = new ArrayList<>();
		
		//loops through and reads entire file
		while(input.hasNextLine()) {
			String [] line = input.nextLine().split(",");
			data.add(new Course(line[0],line[1], line[2]));
		}
		
		for(Course c : data) {
			System.out.format("%-15 | %-35 | %-25\n",
					c.getCode(), c.getName(), c.getInstructor());
		}
		
//		String inputLine = input.nextLine();
		
		} catch(FileNotFoundException e) {
			System.out.println("No file here");
			e.printStackTrace();
		}
		
		//return array of files
		
//		File [] FilewithPath = file.listFiles();
	}

}
