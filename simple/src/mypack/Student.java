package mypack;

class Student {

	private int id;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

	void display() {
		System.out.println(id + "\t\t" + name);
	}

}
