package dog_door;

public class Remote { // 리모컨

	private DogDoor door; // 필드

	public Remote(DogDoor door) { // 생성자
		this.door = door;
	}

	public void pressButton(boolean check) { // 주인의 개를 확인하고 버튼을 눌렀을 때
		
		System.out.println("주인의 개인지 주인이 직접 확인");
		
		if(check) {
			System.out.println("주인의 개가 맞습니다.");
			System.out.println("Pressing the remote control button...");
			if (door.isOpen()) {
				door.close();
			} else {
				door.open();
			}
		} else {
			System.out.println("주인의 개가 아닙니다.");
		}
	}
}
