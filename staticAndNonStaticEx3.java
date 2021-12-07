class staticAndNonStaticEx3
{ 
	int i = 4 ;
	int j = 5 ;
	static int a = 2 ;
	static {
		System.out.println(a);
		staticAndNonStaticEx3 obj2 = new staticAndNonStaticEx3();
		System.out.println(obj2.j);
	}
	public void talk()
		{
          System.out.println("my name is boddepalli srikanth");
		  System.out.println(this);
		  System.out.println(this.i);
		}
	{
		System.out.println("1234");
		System.out.println(this);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(a);
		p1 obj = new p1();
		obj.talk();
		System.out.println(obj.j);
	
	}

}
