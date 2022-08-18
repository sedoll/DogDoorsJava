package dog_door;

public class Remote { // ������

	private DogDoor door; // �ʵ�

	public Remote(DogDoor door) { // ������
		this.door = door;
	}

	public void pressButton(boolean check) { // ������ ���� Ȯ���ϰ� ��ư�� ������ ��
		
		System.out.println("������ ������ ������ ���� Ȯ��");
		
		if(check) {
			System.out.println("������ ���� �½��ϴ�.");
			System.out.println("Pressing the remote control button...");
			if (door.isOpen()) {
				door.close();
			} else {
				door.open();
			}
		} else {
			System.out.println("������ ���� �ƴմϴ�.");
		}
	}
}
