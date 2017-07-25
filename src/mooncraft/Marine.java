package mooncraft;

public class Marine extends Unit{
	
	String species;
	
	public Marine(int pointX, int pointY)
	{
		super(pointX, pointY);
		this.health = 50;
		this.power = 6;
		this.name = "마린";
		this.species = "테란";
	}
	
	public void steampack()
	{
		this.power += 5;
		this.health -= 10;
		System.out.println(this.name + "이 스팀팩을 사용");
	}
	
	//오버라이딩
	public void move(int x, int y)
	{
		this.pointX += x;
		this.pointY += y;
		System.out.println("Go~! Go~!");
		System.out.println(this.name+"의 현재위치: " + this.pointX + ", " + this.pointY);
	}

}
