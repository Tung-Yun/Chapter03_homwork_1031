package test_p17;

public class test_p17 {
	public static void main(String[]args) {
		Car car1;
		car1 = new Car();
		car1.setNumGas(1234, 20.5);
		int num1 = car1.getNum();
		double gas1 = car1.getGas();
		System.out.println("�լd�˫~���ɱo��");
		System.out.println("�����O"+num1+",�T�o�q�O"+gas1);
	}
}
class Car{
	int num;
	double gas;	
	void setNumGas(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�N�T�o�q�]��"+gas);
	}
	int getNum() {
		System.out.println("�լd����");
		return num;
	}	
	double getGas() {
		System.out.println("�լd�T�o�q");
		return gas;
	}
}