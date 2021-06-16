

class StudentData{
    private int rollno;
    private String name;
    private String course;
    private String addres;
    private double fees;
    //defaust construtor
    public  StudentData() {
        course ="BCA";
        fees = 1200.00;
             
    }
    //Parameterizable constructor
    public StudentData(int rollno, String name, String addres){
        this();                              //will call default constructor first when parameterised is called
        this.rollno=rollno;
        this.name=name;
        this.addres=addres;
    }

    public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public double getFees() {
		return fees;
	}
	public void showDetails(){
        System.out.println("Roll no : "+rollno);
        System.out.println("Name : "+name);
        System.out.println("Course : "+course);
        System.out.println("Address : "+addres);
        System.out.println("Fees : "+fees);
    }
}