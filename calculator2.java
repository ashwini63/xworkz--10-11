//with parameter no return type
class calculator2{
	
	public static void add(int a,int b)
	{
	int sum=a+b;
	System.out.println("addition of 2 no's :" +sum);
	}
	
	public static void sub(int a,int b)
	{
	int sub=a-b;
	System.out.println("substraction of 2 no's :" +sub);
	}
	
	public static void mul(int a,int b)
	{
	int mul=a*b;
	System.out.println("multiplication of 2 no's :" +mul);
	}
	
	public static void div(int a,int b)
	{
	int div=a/b;
	System.out.println("division of 2 no's :" +div);
	}
	
	public static void main(String []args){
	int x=50,y=50;
	calculator2.add(x,y);
	calculator2.sub(x,y);
	calculator2.mul(x,y);
	calculator2.div(x,y);
	}
	}