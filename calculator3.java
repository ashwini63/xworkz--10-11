//no parameter with return type
class calculator3{
	
	public static int add()
	{
	int a=80,b=20;
	int sum=a+b;
	return sum;
	}
	public static int sub()
	{
	int a=80,b=20;
	int sub=a-b;
	return sub;
	}
	public static int mul()
	{
	int a=80,b=20;
	int mul=a*b;
	return mul;
	}
	public static int div()
	{
	int a=80,b=20;
	int div=a/b;
	return div;
	}
	public static void main(String []args){
	{
	int plus=calculator3.add();
	System.out.println("addition of 2 no's :" +plus);
	}
	{
	int minus=calculator3.sub();
	System.out.println("substraction of 2 no's :" +minus);
	}
	{
	int multi=calculator3.mul();
	System.out.println("multiplication of 2 no's :" +multi);
	}
	{
	int divi=calculator3.div();
	System.out.println("division of 2 no's :" +divi);
	}
}
}