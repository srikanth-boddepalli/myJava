class OtherClassNonStaticVarUseInThisClass 
{
	public static void main(String[] args) 
	{
		System.out.println(A.a);
		A obj = new A();
		System.out.println(obj.b);
	}
}
