package phone.test;

import phone.subclass.SmartPhone;
import phone.superclass.Phone;

public class PhoneTest {
	
	public static void main(String[] args)
	{
		Phone phone = new Phone("세로본능", 30);
		System.out.println("모델: " + phone.name);
		
		//System.out.println("제조사: " + phone.MANUFACTURER); //에러 발생
		phone.call("010-1234-5678");
		phone.sendMassage("안녕?", "010-1234-5678");
		
		System.out.println();
		
		SmartPhone smartPhone = new SmartPhone("갤럭시 S7" , 80, "Android");
		System.out.println("모델: " + smartPhone.name);
		
		//System.out.println("제조사 : " + smartPhone.MANUFACTURER); //에러 발생
		smartPhone.call("010-0000-0000");
		smartPhone.sendMassage("잘가!", "010-1111-1111");
		smartPhone.connectWIFI("INC");
	}
		
}