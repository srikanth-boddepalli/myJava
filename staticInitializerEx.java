class staticInitializerEx 
{
	static
	{
		System.out.println("fb");
	  login("srikanth" , 1223359l);
    }
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	public static void login(String un , long psw) 
	{
		System.out.println("login is successfull");
	}

}