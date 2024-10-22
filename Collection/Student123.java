
public class Student123 {
	public Student123(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	int id;
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
	String name;
	@Override
	public String toString() {
		return "Student123 [id=" + id + ", name=" + name + "]";
	}

}
