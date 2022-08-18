package dog_door;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Bark bark = new Bark("왈왈"); // 주인의 개
		Bark bark2 = new Bark("월월"); // 주인의 개가 소리를 잘 못낸 경우
		Bark bark3 = new Bark("컹컹"); // 다른 집 개
		DogDoor dogdoor = new DogDoor(); // 개 문
		Remote remote = new Remote(null); // 리모컨
		BarkRecognizer barkreco = new BarkRecognizer(dogdoor); // 개소리 인식기

		Scanner sc = new Scanner(System.in);

		boolean run = true;

		dogdoor.addAllowedBark(bark); // 주인의 개 소리를 문에 저장

		while (run) {
			int sel = Integer.parseInt(sc.nextLine());

			switch (sel) {
			case 1: // 개가 볼일을 보고 혼자 잘 들어왔을 경우
				barkreco.recognize(bark);
				Thread.sleep(6000);
				barkreco.recognize(bark);
				break;
				
			case 2: // 개가 볼일을 보고 왔는데 문이 인식을 못 할 경우
				barkreco.recognize(bark);
				Thread.sleep(6000);
				barkreco.recognize(bark2);
				Thread.sleep(6000);
				remote = new Remote(dogdoor);
				remote.pressButton(true); // 주인이 직접 개를 확인하고 버튼을 누름
				break;
				
			case 3: // 개가 볼일을 보고 나간 사이에 다른 개가 온 경우
				barkreco.recognize(bark);
				Thread.sleep(6000);
				barkreco.recognize(bark3);
				Thread.sleep(6000);
				remote = new Remote(dogdoor);
				remote.pressButton(false); // 주인이 직접 개를 확인하고 버튼을 누름
				break;
				
			case 4: // 주인집 개가 볼일을 보는 사이에 다른집 개가 왔다 가고난 후에 주인집 개가 다시 돌아 온 경우
				barkreco.recognize(bark);
				Thread.sleep(6000);
				barkreco.recognize(bark3);
				Thread.sleep(6000);
				barkreco.recognize(bark);
				break;
				
			case 5: // 주인집 개가 볼일을 보는 사이에 다른집 개가 왔다 가고난 후에 주인집 개가 다시 돌아 왔지만 문이 인식을 못하는 경우
				barkreco.recognize(bark);
				Thread.sleep(6000);
				barkreco.recognize(bark3);
				Thread.sleep(6000);
				remote = new Remote(dogdoor);
				remote.pressButton(true); // 주인이 직접 개를 확인하고 버튼을 누름
				break;
				
			default:
				run = false;
			}
		}

	}

}