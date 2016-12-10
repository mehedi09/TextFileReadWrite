import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/**
*
*
*
* A simple example program that write The file using Scanner,BufferedWriter and reads the text file into a String using Files.lines and stream. 
*
*
*
*/
public class ReadFileLinebyLine {
    public static void main(String[] args) throws IOException {
       
	   try {
			String textExit="";
			
		String contents = Files.lines(Paths.get("WritingingFile.txt")).collect(Collectors.joining("\r\n"));	
	
		FileWriter fWriter = null;
		BufferedWriter writer = null;
				
		fWriter = new FileWriter("WritingingFile.txt");
		writer = new BufferedWriter(fWriter);		
		
		System.out.print("Enter Text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		textExit= "";      
		textExit=text;
			
			
		writer.write(contents+"\r\n"+text+"\r\n");//  \r Thats for new Line
		writer.close();
        System.out.println(contents);
		System.out.println(textExit);
	}
		 catch (Exception e) {
            System.out.println("Error!");
			System.exit(0);
        }
		
		
    }
}