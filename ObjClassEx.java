public class ObjClassEx {
	int id;
	String name;
	float salary;

	public void insertRecord(int i, String n, float s) {
		/*id =i;
		name = n;
		salary = s;*/		
		this.id = i;
		this.name = n;
		this.salary = s;		
	}

	public void display() {
		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("salary : " + salary);
		System.out.println("****************");
	}
	
	public void create_diffWay_Obj(String str){
		System.out.println("Create Obj by : " + str);
	}
	

	public static void main(String[] args) {
		ObjClassEx e1 = new ObjClassEx();
		e1.insertRecord(101, "Vikas", 100000);
		e1.display();
		ObjClassEx e2 = new ObjClassEx();
		e2.insertRecord(102, "Reyansh", 200000);
		e2.display();
		
		
		// Different ways to create the objects
		new ObjClassEx().create_diffWay_Obj("anonymous object.");
		
		ObjClassEx c = new ObjClassEx();
		c.create_diffWay_Obj("Reference Varibale.");
				
		
	}

}
