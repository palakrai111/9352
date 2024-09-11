
public class staticvariable {
	  static String companyname = "sgsitIndkkk";
	  int age;  // instance variable
	  String name;
	  
	 void display()
	 {
		 System.out.println(age + " "+companyname);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticvariable ram = new staticvariable();
		staticvariable shyam = new staticvariable();
		//ram.age = 30;
		ram.name = "ram suryawanshi";
		ram.display();   // 0 sgsitsindore
		//shyam.age = 35;
		//shyam.name = "shyam s";
		shyam.display();
		System.out.println("cn is"+companyname);
	//	System.out.println(age +name);
		
	
           
	}

}
