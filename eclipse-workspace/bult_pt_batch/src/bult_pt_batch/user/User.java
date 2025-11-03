package bult_pt_batch.user;

public class User {
	
	int uid;
	String uname;
	static String company;
	
	
    public void displayInfo()
    {
    	System.out.println("uid :"+uid);
    	System.out.println("uname :"+uname);
    	System.out.println("Company :"+company);
    }
    
    public static void test()
    {
    	System.out.println("Static Method");
    }
}
