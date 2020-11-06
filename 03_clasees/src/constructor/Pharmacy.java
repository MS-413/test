package constructor;
class SinivelCap{
	public void take() {
		System.out.println("콧물이 싹 낫습니다.");
	}
}
class SneezeCap{
	public void take() {
		System.out.println("재재기가 싹 낫습니다.");
	}
}
class SniffleCap{
	public void take() {
		System.out.println("코막힘이 싹 낫습니다.");
	}
}
class Contac600{
	SinivelCap sin;
	SneezeCap snz;
	SniffleCap snf;
	public Contac600(){
		sin = new SinivelCap();
		snz = new SneezeCap();
		snf = new SniffleCap();
	}
	public void take(){
		sin.take();
		snz.take();
		snf.take();
	}
}
class ColdPatient{
	public void takeContc600(Contac600 ct600) {
		ct600.take();
	}
}
public class Pharmacy {

	public static void main(String[] args) {
		ColdPatient sufferer = new ColdPatient();
		Contac600 ct600 = new Contac600();
		sufferer.takeContc600(ct600);
	}

}
