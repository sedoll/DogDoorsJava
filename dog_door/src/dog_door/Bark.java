package dog_door;

public class Bark {

	private String sound; // 소리

	public Bark(String sound) { // 소리 저장
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public boolean equals(Object bark) { // 자신의 개와 소리가 갖을 때
		if (bark instanceof Bark) {
			Bark otherBark = (Bark) bark;
			if (this.sound.equalsIgnoreCase(otherBark.sound)) { // 소리가 같을 때, true
				return true;
			}
		}
		return false; // 소리가 다를 때 false
	}
}
