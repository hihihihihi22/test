package test.main;

import test.mypac.Car;

public class MainClass02 {

	public static void main(String[] args) {
		//Car 클래스로 객체를 생성해서 참조값을 car1이라는 car type 지역변수에 담기
		Car car1 = new Car();
		//Car 클래스로 객체를 생성해서 참조값을 car2이라는 car type 지역변수에 담기
		Car car2 = new Car();
		
		//필드에 String type 의 참조값 대입하기
		car1.name = "소나타";
		car2.name = "그랜저";
		
		//메소드 호출하기
		car1.drive();
		car2.drive();
		
		boolean result = car1 == car2; //false
		//car3 객체에 car2의 참조값을 담는다.
		Car car3 = car2;
		car3.drive(); //그랜저 달림
		//동일객체 (car2 와 car3에 저장된 참조 값이 같다) 임으로 true이다.
		boolean result2 = car2 == car3;
	}

}
