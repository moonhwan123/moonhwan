
public class Dog {
	private String name;
	public String breed;
	private int age;
	
	Dog(){
		this.age=0;
		this.name = "";
		this.breed = "";
		System.out.print("이름 : "+name+"종류"+breed);
	}
	Dog(String name, int age){
		this.name = name;
		this.age = age;
	}
	Dog(String name, String breed, int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

}
