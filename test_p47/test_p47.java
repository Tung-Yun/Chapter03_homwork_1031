package test_p47;

public class test_p47 {
	public static void main(String[]args) {
		Car car1;
		car1 = new Car();
		car1.show();
		
		car1.SetNumGas(1234, 20.5);
		car1.SetName("1號車");
		car1.show();
		
	}
}
class Car{
	private int num;
	private double gas;
	private String name; 
	public Car() {
		num=0;
		gas=0.0;
		name="沒有名稱";
		System.out.println("生成了車子");
	}
	public void SetNumGas(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
	public void SetName(String str) {
		name = str;
		System.out.println("將車名設為"+name);
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("車名是"+name);
	}
}