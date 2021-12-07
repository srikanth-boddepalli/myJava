class staticAndNonStaticEx2
{ 
	int i = 4 ;
	int j = 5 ;
	static int a = 2 ;
	public void talk()
		{
          System.out.println("my name is boddepalli srikanth");
		  System.out.println(this);
		  System.out.println(this.i);
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
