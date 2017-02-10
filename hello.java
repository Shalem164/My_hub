public class Cred {

	public static void main(String[] args) 
	{
		String cred[] = credn().split("-");
		
		System.out.println(cred[0]);
		System.out.println(cred[1]);
	}

	public static String credn() 
	{
		String usr = "username";
		String pass = "password";
			
		return usr+"-"+pass;
	}	
}
