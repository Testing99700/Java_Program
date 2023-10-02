package Generalization;

public class J_A_V 
{
	public static void main(String[] args)
	{
		System.out.println("..................JIO...................");
		JIO J1=new JIO();
		J1.sms();
		J1.calling();
		J1.internet();
		System.out.println("..................Airtel...................");
		
		Airtel A1=new Airtel();
		A1.sms();
		A1.calling();
		A1.internet();
		System.out.println("..................VI...................");
		
		VI V1=new VI();
		V1.sms();
		V1.calling();
		V1.internet();
	}

}
