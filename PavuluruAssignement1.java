/* 
 *  Name: ANIL PAVULURU
 *  CSU ID: 2782551 
 *  CIS 265: Assignment #1 
 *  Description:In this assignment, you will create a Java program. The program prompts users for a student ID and
                assignment a group for the student. The program exits when a 0 is given
*/


import java.io.*;
public class PavuluruAssignement1{
public static void main(String[] args)throws IOException{
            BufferedReader br =new BufferedReader (new InputStreamReader (System.in));
            
System.out.println(" Enter student ID (enter 0 to quit): ");

int enterID=Integer.parseInt (br.readLine());

while(enterID>=1){
int StudID=(int)(Math.random() *10 + 1);

           System.out.println("Student" +" "+enterID + " " +"is assigned to group" + StudID);
           System.out.println("Enter a student ID(enter 0 to quit): ");
           enterID=Integer.parseInt (br.readLine());
           }
            if(enterID==0) {
            
            System.out.println("good byee!");
}
}
}

