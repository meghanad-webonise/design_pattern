import java.util.Scanner;

class Test
{
public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	
	int ch;
	String memorySlot;
	String type="";
	PaymentFactory shapeFactory = new PaymentFactory();
	System.out.println("Select Mobile Model \n1: Nokia \n2: Samsung \n3:Apple");
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
	System.out.println("Select functions \n1:send SMS \n2: send MMS \n3: Make a Call \n 4: Nokia Store \n 5:Make Payment \n 6Exit");
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
		nokia.nokiaStore();
		break;
	case 5:
		
		System.out.println("select paytm or phonepe");
		type=sc.next();
		Transaction  t= shapeFactory.getPayment(type);
		t.makePayment();
	case 6:
		System.exit(0);
	}
	
	
break;
			
		
case 2:
	
	Samsung samsung=new Samsung();
	memorySlot=samsung.memorySlot ? "Available" : "Not Available";	
	System.out.println("You selected samsung mobile:\n fetaures are:");
	System.out.println("Sim type supported: "+samsung.simType);
	System.out.println("Memory Slot "+memorySlot);
	System.out.println("Select functions \n1: send SMS \n2: send MMS \n 3: Make a Call \n 4:Samsung Store \n 5:Make Payment \n 6Exit");
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
		samsung.samsungStore();
		break;
	case 5:
		
		System.out.println("select paytm or phonepe");
		type=sc.next();
		Transaction  t= shapeFactory.getPayment(type);
		t.makePayment();
	case 6:
		System.exit(0);
	}
	
break;
case 3:
	Apple apple=new Apple();
	memorySlot=apple.memorySlot ? "Available" : "Not Available";	
	System.out.println("You selected Apple mobile:\n fetaures are:");
	System.out.println("Sim type supported: "+apple.simType);
	System.out.println("Memory Slot "+memorySlot);
	System.out.println("Select functions \n1: send SMS \n2: send MMS \n3: Make a Call \n 4:Apple Store\n \\n 5:Make Payment \\n 6Exit");
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
		apple.appleStore();
		break;
	case 5:
		
		System.out.println("select paytm or phonepe");
		type=sc.next();
		Transaction  t= shapeFactory.getPayment(type);
		t.makePayment();
	case 6:
		System.exit(0);
	}
break;

	

	
	}
	
	
	
	}
}