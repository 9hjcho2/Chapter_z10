package phone.superclass;

public class Phone {
	
	public String name;
	
	protected final String MANUFACTURER; //protected로 상수로 선언
	
	public Phone(String name, int price)
	{
		this.name = name;
		this.MANUFACTURER = "INCREPAS";
	}
	
	//전화거는 기능
	public void call(String phoneNumber)
	{
		System.out.println(phoneNumber = "와 통화 중");
	}
	
	//문자보내는 기능
	public void sendMassage(String msg, String phoneNumber)
	{
		System.out.println(phoneNumber = "에게 메세지전송 내용: " + msg);
	}

}
