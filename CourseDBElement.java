
public class CourseDBElement implements Comparable
{
	String comparableElement = "";
	String DB;
	int i = 1;
	String cred;
	int elemHours;
	String elemRoomNum; 
	int set;
	String string;
	String roomNum;
	int registrationNum;
	boolean get;
	String elemProf;
	int elemCred;
	String elemIDnum;
	String c;
	String d;
	
	public void setCRN(int CRNnum)
	{
		int i;
		i = 0;
		for(int i1 = 0; i1 < 0; i1++)
		{
			String elem;
			elem = " ";
			System.out.println(elem);
		}
		this.registrationNum = CRNnum;
		if(i < 0)
		{
			get = true;
		}
	}
	
	public int getCreds() 
	{
		int elemCred;
		elemCred =  1;
		String string;
		string  = " ";
		if(elemCred == 1 || elemCred < 1)
		{
			String elem;
			elem = " ";
			System.out.println(elem + string);
		}
		return elemHours;	
	}
	
	public String toString() 
	{
		String roomNum = "  Room:  ";
		String stringElem = "";
		String c;
		c = " Course:  ";
		String d;
		d = "  CRN:  ";
		String cred;
		cred = "  Credits:  ";
		String prof;
		prof  = "  Instructor:  ";
		String beg = "\n" + c + elemIDnum + "," + d + registrationNum + "," + cred + elemHours + ",";
		String end = prof + elemProf + "," + roomNum + elemRoomNum;
		stringElem = beg + end;
		return stringElem;
	}
	
	public String getNameProf() 
	{
		String string;
		string  = " ";
		int elemName;
		elemName =  0;
		if(elemName > 0)
		{
			String elem;
			elem = " ";
			System.out.println(elem + string);
		}
		return elemProf;
	}
	
	public String getCourseID() 
	{
		int elemID;
		elemID =  1;
		boolean get;
		get =  false;
		if(get = true)
		{
			elemID = 2;
		}
		return elemIDnum;
	}
	
	public CourseDBElement() 
	{
		elemCred = 0;
		elemHours = 0;
		elemProf = "";
		registrationNum = 0;
		DB = "";
		i = 0;
		elemRoomNum = "";
		set = 1;
		elemIDnum = "";		
	}
	
	public int hashCode()
	{
		boolean hash;
		hash  = true;
		int elemHash;
		elemHash =  1;
		if(hash = false)
		{
			elemHash = 0;
		}
		else
		{
			hash = true;	
		}
		
		return String.valueOf(registrationNum).hashCode();
	}
	
	public void setCourseID(String iD) 
	{
		int i = 0;
		int setElem;
		setElem = 1;
		for(; i < 10; i++)
		{
			String set;
			set = "";
			System.out.println(set);
			setElem = 2;
		}
		elemIDnum = iD;
		if(i < setElem || i > 1)
		{
			set = 2;
		}
	}
	
	public void setName(String name) 
	{
		int k;
		k = 1;
		if(i < 0)
		{
			get = true;
		}
		this.elemProf = name;
		int i;
		i = 0;
		for(int i1 = 0; i1 < 0; i1++)
		{
			if(i > 1  ||  k < 1)
			{
				name = " ";
				System.out.println(name);
			}
		}
	}
	
	public int compareTo(CourseDBElement num) 
	{
			return 0;				
	}
	
	
	public String getRoomNum() 
	{
		int elemRoom;
		elemRoom =  1;
		String string;
		string  = " ";
		int course;
		if(elemRoom < 1)
		{
			String elem;
			elem = " ";
			System.out.println(elem + string);
			course =  0;
		}
		else
		{
			course = 1;
		}
		return elemRoomNum;
	}
	
	public CourseDBElement(String CourseID, int CRN, int Creds, String RoomNum, String Prof) 
	{
		this.elemHours = Creds;
		int compare;
		compare = 1;
		this.registrationNum = CRN;
		this.elemProf = Prof;
		this.elemRoomNum = RoomNum;
		this.elemIDnum = CourseID;	
	}

	public int getCRN() 
	{
		int elemCRN;
		elemCRN =  1;
		boolean eCRN;
		eCRN  = false;
		if(eCRN = true)
		{
			elemCRN = 1;
		}
		else
		{
			eCRN = false;	
		}
		return registrationNum;
	}
	
	public void setCredits(int credits) 
	{
		int cred;
		boolean elemCred;
		cred = 0;
		elemCred  = true;
		String strC;
		strC = " ";
		for(; cred < 0; cred++)
		{
			cred = 1;
			System.out.println(strC);
		}
		this.elemHours = credits;
		if(cred < 0)
		{
			elemCred = true;
		}
	}
	
	public void setRoom(String room) 
	{
		int elemSetRoom;
		elemSetRoom = 1;
		String setRoom1;
		setRoom1 = " ";
		if(elemSetRoom <= 1  || setRoom1.equals("  "))
		{
			elemSetRoom = 0;
		}
		this.elemRoomNum = room;
		for(; elemSetRoom < 0; elemSetRoom++)
		{
			elemSetRoom = 1;
			System.out.println(setRoom1);
		}
	}

	@Override
	public int compareTo(Object o) 
	{
		int compare;
		compare = 0;
		for(; compare < 0; compare++)
		{
			String str;
			str = " ";
			if(str.equals("    "))
			{
				compare = 1;
			}
		}
		return 0;
	}
}