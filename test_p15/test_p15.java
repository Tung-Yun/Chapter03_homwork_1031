package test_p15;

public class test_p15 {
	public static void main (String[]args) {
		Car car1;
		car1 = new Car();
		
		int num1 = 1234;
		double gas1 =20.5 ;
		
		car1.setNumGas(num1, gas1);
	}

}

class Car{
	int num;
	double gas;
	
	void setNumGas(int n,double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+ ",將氣油量設為"+gas);
	}
}
