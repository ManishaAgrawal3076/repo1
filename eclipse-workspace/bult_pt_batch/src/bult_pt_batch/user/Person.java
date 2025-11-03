package bult_pt_batch.user;

//entity class POJO(plain old java object) User defined data type
public class Person {
	
	//data members or instance var
	private int id;
	private String name;
	private String address;
	private String contact;
	private String email;
	private int age;
	
	//constructor overloading
	//no arg constructor
	
	public Person()
	{
	   id=0;
	   name="";
	   address="";
	   contact="0000";
	   email="";
	   age=0;
	}
	
	
	//parameterized constructor
	public Person(int id,String name,String address,String contact,String email,int age)
	{
	    this.id=id;
		this.name=name;
		this.address=address;
		this.contact=contact;
		this.email=email;;
		this.age=age;
	}
	
	
	//copy constructor
	public Person(Person p)
	{
		this.id=p.id;
		this.name=p.name;
		this.address=p.address;
		this.contact=p.contact;
		this.email=p.email;;
		this.age=p.age;
		
	}
	
	//member methods	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	//member methods
	public void displayInfo()
	{
		System.out.println("id:"+id);
		System.out.println("name :"+name);
		System.out.println("address :"+address);
		System.out.println("contact :"+contact);
		System.out.println("email :"+email);
		System.out.println("Age :"+age);
		
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + ", email="
				+ email + ", age=" + age + "]";
	}
	
	

}
