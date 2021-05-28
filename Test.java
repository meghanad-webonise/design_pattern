import java.util.Scanner;

class CellPhone
{

String simType="";
boolean memorySlot=false;
 
	CellPhone(String simType,boolean memorySlot)	
	{
	this.simType=simType;
	this.memorySlot=memorySlot;
	}

	public void sendSMS(String mobileNumber)
	{
	System.out.println("Message send Successfully"+ mobileNumber);
	}
	public void sendMMS(String mobileNumber)
	{
	System.out.println("MMS send SuccessFully to "+mobileNumber);
	}
	public void makeCall(String mobileNumber)
	{
	
	System.out.println("Calling to"+mobileNumber+" ...");
	}

}
class Nokia extends CellPhone	
{
	
	Nokia()
	{
	super("dual",true);
	}
	
	public void nokiaPay()
	{
	System.out.println("Send money using Nokia Pay app");
	}

}

class Samsung extends CellPhone
{
	Samsung()
	{
	super("single",true);
	}
	public void samsungPay()
	{
	System.out.println("Send Money using Samsung Pay app" );
	}
	
}
class Apple extends CellPhone
{
	Apple()
	{
	super("dual",true);
	}
	public void applePay()
	{
	System.out.println("Send Money using apple pay");
	}
}


class Test
{
public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	
	int ch;
	String memorySlot;
	System.out.println("Select Mobile Model \n1: Android \n2: Samsung \n3:Apple");
	ch=sc.nextInt();
	switch(ch)
	{
case 1:
	Nokia nokia=new Nokia();
	memorySlot=nokia.memorySlot ? "Available" : "Not Available";	
	String mobileNumber="";
	System.out.println("You selected nokia mobile:\n fetaures are:");
	System.out.println("Sim type supported: "+nokia.simType);
	System.out.println("Memory Slot "+memorySlot);
	System.out.println("Select functions \n1:send SMS \n2: send MMS \n3: Make a Call \n 4: Nokia Pay \n 5:Exit ");
	ch=sc.nextInt();
	
	switch(ch)
	{
	case 1:
		System.out.println("Enter number");
		mobileNumber=sc.next();
		nokia.sendSMS(mobileNumber);
		break;
	case 2:
		System.out.println("Enter number");
		mobileNumber=sc.next();

		nokia.sendMMS(mobileNumber);
		break;
	case 3:
		System.out.println("Enter number");
		mobileNumber=sc.next();
		nokia.makeCall(mobileNumber);
		break;
	case 4:
		nokia.nokiaPay();
		break;
	case 5:
		System.exit(0);
	}
	
	
break;
			
		
case 2:
	
	Samsung samsung=new Samsung();
	memorySlot=samsung.memorySlot ? "Available" : "Not Available";	
	System.out.println("You selected samsung mobile:\n fetaures are:");
	System.out.println("Sim type supported: "+samsung.simType);
	System.out.println("Memory Slot "+memorySlot);
	System.out.println("Select functions \n1: send SMS \n2: send MMS \n 3: Make a Call \n 4:Samsung Pay \n5: Exit ");
	ch=sc.nextInt();
	
	switch(ch)
	{
	case 1:
		System.out.println("Enter number");
		mobileNumber=sc.next();
		samsung.sendSMS(mobileNumber);
		break;
	case 2:
		System.out.println("Enter number");
		mobileNumber=sc.next();

		samsung.sendMMS(mobileNumber);
		break;
	case 3:
		System.out.println("Enter number");
		mobileNumber=sc.next();
		samsung.makeCall(mobileNumber);
		break;
	case 4:		
		samsung.samsungPay();
		break;
	
	case 5:
		System.exit(0);
	}
	
break;
case 3:
	Apple apple=new Apple();
	memorySlot=apple.memorySlot ? "Available" : "Not Available";	
	System.out.println("You selected Apple mobile:\n fetaures are:");
	System.out.println("Sim type supported: "+apple.simType);
	System.out.println("Memory Slot "+memorySlot);
	System.out.println("Select functions \n1: send SMS \n2: send MMS \n3: Make a Call \n 4:Apple Pay\n 5: Exit ");
	ch=sc.nextInt();
	
	switch(ch)
	{
	case 1:
		System.out.println("Enter number");
		mobileNumber=sc.next();
		apple.sendSMS(mobileNumber);
		break;
	case 2:
		System.out.println("Enter number");
		mobileNumber=sc.next();

		apple.sendMMS(mobileNumber);
		break;
	case 3:
		System.out.println("Enter number");
		mobileNumber=sc.next();
		apple.makeCall(mobileNumber);
		break;
	case 4:
		apple.applePay();
		break;
	case 5:
		System.exit(0);
	}
break;

	

	
	}
	
	
	
	}
}
