package test_p51;

public class test_p51 {
	public static void main(String[]args) {
		Car[] car1;
		car1 = new Car[3];
		for(int i=0;i<car1.length;i++) {
			car1[i] = new Car();
		}
		car1[0].SetNumGas(1234, 20.5);
		car1[1].SetNumGas(2345, 30.5);
		car1[2].SetNumGas(3456, 40.5);
	
		for(int i=0;i<car1.length;i++) {
			car1[i].show();
		}
	}

}
class Car{
	private int num;
	private double gas;
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("�ͦ��F���l");
	}
	public void SetNumGas(int n,double g) {
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
	public void show(){
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}