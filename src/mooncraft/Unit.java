package mooncraft;

public class Unit {
	int health;
	int pointX;
	int pointY;
	int power;
	int defensive;
	String name;
	boolean isHidden;
	
	public Unit(int health, int pointX, int pointY, int power, int defensive, String name)
	{
		this.health = health;
		this.pointX = pointX;
		this.pointY = pointY;
		this.power = power;
		this.defensive = defensive;
		this.name = name;
	}
	
	public Unit(int pointX, int pointY)
	{
		this.pointX = pointX;
		this. pointY = pointY;
	}
	
	public void move(int x, int y)
	{
		this.pointX += x;
		this.pointY += y;
		System.out.println(this.name + "의 현재위치: " + this.pointX + "," + this.pointY);
	}
	
	public void Attack(Unit targetUnit)
	{
		if(!targetUnit.isHidden)
		{
			targetUnit.health -= (this.power - targetUnit.defensive);
			System.out.println(targetUnit.name + "을 공격. 남은 체력: " + targetUnit.health);
		}
		else
		{
			System.out.println(this.name + ": " + targetUnit.name + "이 보이지 않아 공격불가");
		}
	}
	

}
