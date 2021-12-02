class loginByOverLoading 
{
	public static void main(String[] args) 
	{
	  login("srikanth" , "sri123");
	  login("srikanth" , 1223359l);
	}
	public static void login(String un , String psw) 
	{
		System.out.println("login is successfull");
	}
	public static void login(String un , long psw) 
	{
		System.out.println("login is successfull");
	}	
}
