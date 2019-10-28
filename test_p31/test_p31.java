package test_p31;

public class test_p31 {
	public static void main(String[]args) {
		Car.showSum();
		
		Car car1;
		Car car2;
		car1 = new Car();
		
		car1.setCarNumGas(1234, 20.5);
		car1.showSum();
		
		car2 = new Car();
		car2.setCarNumGas(4567, 30.5);
		
	}
}
class Car{
	private int num;
	private double gas;
	public static int sum = 0;
	public static void showSum() {
		System.out.println("車子總共有"+sum+"台");
	}
	public Car(){
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("生成了車子");
	}
	public void setCarNumGas(int n,double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+",汽油量設為" +gas);
	}
}