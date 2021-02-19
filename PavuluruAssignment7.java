package pavulurucis265;


/* 
 *  Name: ANIL PAVULURU
 *  CSU ID: 2782551 
 *  CIS 265: Pavuluru Assignment#7
 *  Description:In this assignment, you will create a Java program to search recursively for a file in a directory
 
 NOTE: EXTRABONUS ALSO WRITTEN

*/


import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PavuluruAssignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dirName = args[0];
		String fileName = args[1];
		System.out.println(dirName +" " + fileName);
		File dir = new File(dirName);
		File[] files = dir.listFiles(new FileFilter() {

			@Override
			public boolean accept(File file) {
				return file.getName().startsWith(fileName);
			}
		});
		for (int i=0;i<files.length;i++) {

			String filePath = files[i].getAbsolutePath();
			BasicFileAttributes basicFileAttributes;
			
			    try {
			    	basicFileAttributes = Files.readAttributes(files[i].toPath(), BasicFileAttributes.class);
					 SimpleDateFormat sdf = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
					 System.out.println((i+1)+"-->"+filePath);
					 System.out.println("File Creation Time: "+sdf.format(new Date(basicFileAttributes.creationTime().toMillis())));
					 System.out.println("File Last Modified Time: "+sdf.format(new Date(basicFileAttributes.lastModifiedTime().toMillis())));
					 System.out.println("File size: "+basicFileAttributes.size()+"\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error in reading File BasicAttributes");
					e.printStackTrace();
				}
			   
		}

	}

}
