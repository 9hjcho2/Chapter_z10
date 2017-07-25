package mooncraft;

public class Zergling  extends Unit{
	String species;
	
	public Zergling(int pointX, int pointY)
	{
		super(pointX, pointY);
		this.health = 35;
		this.power = 5;
		this.name = "저글링";
		this.species = "저그";
	}
	
	public void burrow()
	{
		this.isHidden = true;
		System.out.println(this.name + "이 버로우를 사용");
	}
	
	//오버라이딩
	public void move(int x, int y)
	{
		this.pointX += x;
		this.pointY += y;
		System.out.println("꾸에엑");
		System.out.println(this.name + "의 현재위치: " + this.pointX + ", " + this.pointY);
	}

}
