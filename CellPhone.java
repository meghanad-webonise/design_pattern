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
	
	public void nokiaStore()
	{
	System.out.println("Download App");
	}



	


}

class Samsung extends CellPhone 
{
	Samsung()
	{
	super("single",true);
	}
	public void samsungStore()
	{
		System.out.println("Download App");
	}


	

	
}

class Apple extends CellPhone
{
	Apple()
	{
	super("dual",true);
	}
	public void appleStore()
	{
	System.out.println("Download App");
	}


}

