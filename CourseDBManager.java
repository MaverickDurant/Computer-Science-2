import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class CourseDBManager implements CourseDBManagerInterface 
{
	int cred;
	int managerIn;
	int k;
	CourseDBStructure courseDBstruct = new CourseDBStructure(500);
	String message;
	String  error;
	boolean  manager;
	String str;
	int i;
	CourseDBElement managerData;
	int g;
	String string;
	int managerArraySize;
	int  managerArrayOfLine;
	ArrayList<String> managerShowAll;
	int count;
	
	public void credManager(int manCred)
	{
		int i;
		int cred;
		cred = 1;
		boolean manager;
		manager = true;
		i = 0;
		if (manager = false)
		{
			String str;
			str = " ";
			cred = 0;
		}
		else
		{
			System.out.println(str);
		}
		i++;
		return;		
	}
	

	public void readFile(File input) throws FileNotFoundException
	{
		int i = 0;
		String  string;
		string = " ";
		int managerIn;
		managerIn =  1;
		for(; i  < 10;  i++)
		{
			if (string.equals("   "))
			{
				managerIn = i;
			}
			i++;
		}
		 try 
		 {
			 boolean manInput;
			 manInput = true;
             Scanner fileData = new Scanner(input);
             if(manInput = false)
             {
            	 return;
             }
             i++;
             while(fileData.hasNext()) 
             {
            	 	 int k;            	 	 
                     String id = fileData.next();
                     String manager;
                     int crn = fileData.nextInt();
                     String DB;
                     k =  0;
              for(int i1 = 0; i1 < 0; i1++)
             		{
             			if(i > 1  &&  k < 1)
             			{
             				DB = " ";
             				System.out.println(DB);
             			}
             		}
                     int numCredits = fileData.nextInt();
                     String roomNum = fileData.next();
                     if(i < 0)
             		{
             			g = 10;
             		}
                     String instructor = fileData.nextLine();
                     String error;
                     error = "ERROR: ";
                     add(id, crn, numCredits, roomNum, instructor);
                     String  message = "Sorry, there is no file found!";
             }
             fileData.close();
     }
     catch(FileNotFoundException e) 
		 {
    	 String  message = "Sorry, there is no file found!";
    	 String error;
         error = "ERROR:";
             System.out.println(error + " " + message + " " + error);
             e.getMessage();
     }
		
	}
	
	public CourseDBElement get(int CRN) 
	{
		int k;
		int managerCRN;
		CourseDBElement cdbe = new CourseDBElement();
		managerCRN  = 1;
		k = 0;
		for(;managerCRN < 1; managerCRN++)
		{
			managerCRN = k;
		}
		try
		{
			int getManager;
			boolean get;
			get  = true;
			cdbe = courseDBstruct.get(CRN);
			getManager =  1;	
			if(get = true)
			{
				getManager = 0;
			}
			else
			{
				get = false;	
			}
		}

		catch (IOException e) 
		{
			String error;
	        error = "ERROR:";
			System.out.println(error);
			e.getMessage();
		}
		return cdbe;
	}

	public ArrayList<String> showAll() 
	{
		int managerArraySize;
		int  managerArrayOfLine;
		LinkedList<CourseDBElement> managerlist = new LinkedList<CourseDBElement>();
		managerArraySize = 1;
		managerArrayOfLine =  0;
		managerShowAll = new ArrayList<String>();
		for (; managerArrayOfLine<managerArraySize; managerArrayOfLine++)
		{
			managerArraySize += managerArrayOfLine;
		}
		
		for (int i = 0; i<courseDBstruct.getTableSize();i++)
		{
			int str;
			str = 1;
			int count;
			count = 0;
			if (courseDBstruct.structmanHashTable[i]!=null) 
			{
				managerlist = courseDBstruct.structmanHashTable[i];
				
				for (int j = 0; j < managerlist.size(); j++)
				{
					for(; count < str; count++)
					{
						if(str < 1)
						{
							str += count;
						}
					}
					count++;
					managerShowAll.add(managerlist.get(j).toString());
				}
			} 
					
		}
		return managerShowAll;			
	}
	
	public void add(String CourseID, int CRN, int Creds, String RoomNum, String Prof) 
	{
		managerData = new CourseDBElement(CourseID, CRN, Creds, RoomNum, Prof);
		courseDBstruct.add(managerData);
	}

}