package dogDoor;

public class Main {

	public static void main(String[] args) {
		Bark bark = new Bark(null);
		Remote remote = new Remote(null);
		BarkRecognizer barkreco = new BarkRecognizer(null);
		DogDoor dogdoor = new DogDoor();
		
		dogdoor.open();
		
	}

}
