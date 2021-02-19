package pavulurucis265;


/* 
 *  Name: ANIL PAVULURU
 *  CSU ID: 2782551 
 *  CIS 265: Pavuluru Assignment#8
 *  Description:In this assignment, you will create a Java program to read a text file and count the frequency of its words.
 
 NOTE: EXTRABONUS ALSO WRITTEN

*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PavuluruAssignment8 {
          
public static void main(String[] args)throws IOException {
	String inputFileName=args[0];
	String line;
	TreeMap<String, Integer> wordsMap=new TreeMap<String, Integer>();
	
	//open file to read
	FileReader file= null;
	BufferedReader br= null;
	try {
		file =new FileReader("F://" + inputFileName);
		br = new BufferedReader(file);
	
	//read lines in the file
	while((line=br.readLine())!=null) {
		  String s=line.toLowerCase().replaceAll("[^a-zA-Z0-9]", " ").replaceAll("\\s{2,}"," ").trim();
		  String[] words = s.split(" ");
		  
		    for(String tmpSTr : words) {
			   if(!wordsMap.containsKey(tmpSTr) && tmpSTr.trim() !=null) {
				   wordsMap.put(tmpSTr, 1);
			   } else {
		           wordsMap.put(tmpSTr, wordsMap.get(tmpSTr) + 1);
			   }    
	       }
	}
	} catch (FileNotFoundException e) {
	   // TODO AUTO-GENERATED CATCH BLOCK
		System.out.println("There is an issue with the input file" +e);
		e.printStackTrace();
	} catch (IOException e) {
		// TODO AUTO-GENERATED CATCH BLOCK
		System.out.println("There is an issue in reading the content of the file" +e);
		e.printStackTrace();
	} finally {
		if (br !=null)
			br.close();
	}
	for(Map.Entry<String, Integer> entry : wordsMap.entrySet())
		System.out.println(entry.getKey() + " : " +entry.getValue());
    }
}
		
		
	
