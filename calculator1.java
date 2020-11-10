//no parameter no return type
class calculator1{
	
	public static void add()
	{
	int a=50,b=80,sum;
	sum=a+b;
	System.out.println("addition of 2 no's :" +sum);
	}
	
	public static void sub()
	{
	int a=50,b=30,sub;
	sub=a-b;
	System.out.println("substraction of 2 no's :" +sub);
	}
	
	public static void mul()
	{
	int a=50,b=40,mul;
	mul=a*b;
	System.out.println("multiplication of 2 no's :" +mul);
	}
	
	public static void div()
	{
	int a=50,b=25,div;
	div=a/b;
	System.out.println("division of 2 no's :" +div);
	}
	
	public static void main(String []args){
	calculator1.add();
	calculator1.sub();
	calculator1.mul();
	calculator1.div();
	}
}
