package Inheritance;

public class WhatsApp 

//multi-level inheritance example

{
	public static void main(String[] args)
	{
		//create object of whatsAppV3 class 
		    WhatsAppV3 v3=new WhatsAppV3();
		//calling objects	
			v3.Textmsg();
			v3.AudioCalling();
			v3.VideoCalling();		
			System.out.println("--------------------------------------");
			
		//create object of whatsAppV2 class 
	        WhatsAppV2 v2=new WhatsAppV2();
		//calling object
			v2.Textmsg();
			v2.AudioCalling();
			System.out.println("--------------------------------------");

	    //create object of whatsAppV1 class 
	        WhatsAppV1 v1=new WhatsAppV1();
	    //calling object
			v2.Textmsg();
	}

}
