//with parameter with return type
class calculator4{
	public static int add(int a,int b)
	{
	int sum=a+b;
	return sum;
	}
	public static int sub(int a,int b)
	{
	int sub=a-b;
	return sub;
	}
	public static int mul(int a,int b)
	{
	int mul=a*b;
	return mul;
	}
	public static int div(int a,int b)
	{
	int div=a/b;
	return div;
	}
	public static void main(String []args){
	{
	int x=80,y=90;
	int plus=calculator4.add(x,y);
	System.out.println("addition of 2 no's=" +plus);
	}
	{
	int x=80,y=70;
	int minus=calculator4.sub(x,y);
	System.out.println("substraction of 2 no's=" +minus);
	}
	{
	int x=80,y=90;
	int multi=calculator4.mul(x,y);
	System.out.println("multiplication of 2 no's=" +multi);
	}
	{
	int x=80,y=80;
	int divi=calculator4.div(x,y);
	System.out.println("division of 2 no's=" +divi);
	}
	}
}