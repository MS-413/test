package constructor;

public class MyClass {
	int x = 5;
	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();		
		System.out.println(mc1);
		System.out.println(mc2);
		System.out.println(mc1.x);
		mc1.x = 10;
		System.out.println(mc1.x);
		System.out.println(mc2.x);
		Animal dog = new Animal();
		dog.setAge(100);
		System.out.println(dog.sound("dog"));
		System.out.println(dog.getAge()+"살");
	}
}
