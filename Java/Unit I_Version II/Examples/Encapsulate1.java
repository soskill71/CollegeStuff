class Student{  
	//private data member  
	private String name="Rahul";  
	//getter method for name  
	public String getName(){  
	return name;  
	}  
	//setter method for name  
	public void setName(String name){  
	this.name=name;  
	}  
}  
class Encapsulate1{  
	public static void main(String[] args){  
	//creating instance of the encapsulated class  
	Student s=new Student();  
	//s.name="Ram";
	//setting value in the name member  
	//s.setName("vijay");  
	//getting value of the name member  
	System.out.println(s.getName());  
	}  
}  