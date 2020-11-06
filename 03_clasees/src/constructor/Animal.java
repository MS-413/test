package constructor;

public class Animal {
	private int age = 0 ;
	String sound="";
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	String sound(String kind) {
		return String.format("%s ?", kind);
	}
	

}
