package assignment;
 /* Name:Anil Pavuluru
 * CSU ID:2782551
 * CIS-265:Assignment #2
 * Descriptio:In this assignment, you will create a Java program which use a 2-dimensional array to store student
records. Each student record contains a student ID and a score, both integers.
 * 
 * 
 * Note:  I have written the code for the extra bonus points using additional features
 */



import java.util.*;
public class PavuluruAssignment2 {

public static void main(String[] args) {

int grno,grdid,gradscore,number,find;

Scanner input1 = new Scanner(System.in); 
Scanner input2 = new Scanner(System.in);
Scanner input3 = new Scanner(System.in);
        
System.out.println("How many student record are there ? ");
        grno = input1.nextInt();
             
            if(grno<=0)
             {
                System.out.println("Number of students must be greater than zero");
                return;
             }

            int [][] gradrecord = new int[grno][2];
        
                for(int i=0;i<gradrecord.length;i++)
                {
                do
                {
                   find=0;
                   System.out.println("Enter Student "+i+"'s ID and Score ");
                   grdid = input2.nextInt();
                   gradscore=input3.nextInt();
                
                   if(i>0)
                       find=search(i,grdid,gradrecord);
                    
                        if(find==1)
                            System.out.println("\nStudent ID "+grdid+" Assigned to other Enter the Different one\n"); 
                        else
                        {
                       gradrecord[i][0]=grdid;
                       gradrecord[i][1]=gradscore;
                        }
                }while(find==1);
                }
                
                do
                {
                find=0;
                number=0;
                    System.out.println("Enter a Student ID  (enter 0 to quit)");
                    grdid=input2.nextInt();
                    number=grdid;
                    
                    if(number!=0)
                    {
                    
                        for(int j=0;j<gradrecord.length;j++) 
                        {
                            if(gradrecord[j][0]==number)
                            {
                            find=1;
                                System.out.println("\nStudent "+gradrecord[j][0]+"  scored "+gradrecord[j][1]+"\n"); 
                            } 
                        }
                        
                        if(find==0)
                        System.out.println("Student ID "+number+" not found\n");
                    }
                }while(number!=0);  
                
                System.out.println("Good Bye!");
}
   
public  static int search(int p,int gradnumber,int [][] graddata)
{
int sfind=0;

for(int j=0;j<=p;j++) 
         {
             if(graddata[j][0]==gradnumber)
             {
              sfind=1;
                
             } 
         }

return sfind;
}
} 