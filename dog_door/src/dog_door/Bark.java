package dog_door;

public class Bark {

	private String sound; // �Ҹ�

	public Bark(String sound) { // �Ҹ� ����
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public boolean equals(Object bark) { // �ڽ��� ���� �Ҹ��� ���� ��
		if (bark instanceof Bark) {
			Bark otherBark = (Bark) bark;
			if (this.sound.equalsIgnoreCase(otherBark.sound)) { // �Ҹ��� ���� ��, true
				return true;
			}
		}
		return false; // �Ҹ��� �ٸ� �� false
	}
}
