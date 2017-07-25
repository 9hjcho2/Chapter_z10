package phone.subclass;

import phone.superclass.Phone;

public class SmartPhone extends Phone{
	
	public String os;
	
	public SmartPhone(String name, int price, String os)
	{
		super(name, price); //super -> 부모클래스의 생성자 
		this.os = os;
		System.out.println("제조사: " + MANUFACTURER);
	}
	
	//와이파이 연결 메서드
	public void connectWIFI(String wifiName)
	{
		System.out.println("와이파이에 연결됨. 명칭: " + wifiName);
	}
	
	//전화 연결 메서드
	public void call(String phoneNumber) // 부모클래스의 함수와 오버라이딩
	{
		System.out.println(phoneNumber + "와 VoLTE통화 중");
	}

}
