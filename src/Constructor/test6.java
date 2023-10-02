package Constructor;

public class test6 
{
	String studentNmae;
	boolean condition;
	float marks;
	char grade;
	test6(String a,boolean x,float y,char z)
	{
		studentNmae=a;
		condition=x;
		marks=y;
		grade=z;
	}
	public void m1()
	{
		System.out.println(studentNmae);
		System.out.println(condition);
		System.out.println(marks);
		System.out.println(grade);
	}
	public static void main(String[] args)
	{
		test6 t6=new test6("Rahul",true,70.59f,'A');
		t6.m1();
	}

}
