package bult_pt_batch;

import bult_pt_batch.user.Person;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p=new Person(100,"Divya","Hyderabad","456456567","divya@gmail.com",20);
		Person p2=new Person(p);
		
		p.setContact("666666666");
		System.out.println(p.getContact());
		
		//p.displayInfo();
		System.out.println(p.toString());
		System.out.println("-----------------------------------------------------------------------");
		//p2.displayInfo();
		System.out.println(p2);

	}

}
