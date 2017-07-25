package mooncraft;

public class mooncraftTest {

	public static void main(String[] args) {
		//Unit marine = new Unit(50, 200, 300, 6, 1, "마린");
		//Unit zergling = new Unit(35, 500, 100, 5, 1, "저글링");
		
		//marine.move(-50,  100);
		//marine.Attack(zergling);
		
		Zergling zergling = new Zergling(20, 50);
		Marine marine = new Marine(20, 40);
		
		marine.move(100,  40);
		zergling.move(100,  40);
		marine.Attack(zergling);
		zergling.Attack(marine);
		marine.steampack();
		marine.Attack(zergling);
		zergling.burrow();
		marine.Attack(zergling);
	}

}
