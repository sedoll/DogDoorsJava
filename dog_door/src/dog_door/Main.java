package dog_door;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Bark bark = new Bark("�п�"); // ������ ��
		Bark bark2 = new Bark("����"); // ������ ���� �Ҹ��� �� ���� ���
		Bark bark3 = new Bark("����"); // �ٸ� �� ��
		DogDoor dogdoor = new DogDoor(); // �� ��
		Remote remote = new Remote(null); // ������
		BarkRecognizer barkreco = new BarkRecognizer(dogdoor); // ���Ҹ� �νı�

		Scanner sc = new Scanner(System.in);

		boolean run = true;

		dogdoor.addAllowedBark(bark); // ������ �� �Ҹ��� ���� ����

		while (run) {
			int sel = Integer.parseInt(sc.nextLine());

			switch (sel) {
			case 1: // ���� ������ ���� ȥ�� �� ������ ���
				barkreco.recognize(bark);
				Thread.sleep(6000);
				barkreco.recognize(bark);
				break;
				
			case 2: // ���� ������ ���� �Դµ� ���� �ν��� �� �� ���
				barkreco.recognize(bark);
				Thread.sleep(6000);
				barkreco.recognize(bark2);
				Thread.sleep(6000);
				remote = new Remote(dogdoor);
				remote.pressButton(true); // ������ ���� ���� Ȯ���ϰ� ��ư�� ����
				break;
				
			case 3: // ���� ������ ���� ���� ���̿� �ٸ� ���� �� ���
				barkreco.recognize(bark);
				Thread.sleep(6000);
				barkreco.recognize(bark3);
				Thread.sleep(6000);
				remote = new Remote(dogdoor);
				remote.pressButton(false); // ������ ���� ���� Ȯ���ϰ� ��ư�� ����
				break;
				
			case 4: // ������ ���� ������ ���� ���̿� �ٸ��� ���� �Դ� ���� �Ŀ� ������ ���� �ٽ� ���� �� ���
				barkreco.recognize(bark);
				Thread.sleep(6000);
				barkreco.recognize(bark3);
				Thread.sleep(6000);
				barkreco.recognize(bark);
				break;
				
			case 5: // ������ ���� ������ ���� ���̿� �ٸ��� ���� �Դ� ���� �Ŀ� ������ ���� �ٽ� ���� ������ ���� �ν��� ���ϴ� ���
				barkreco.recognize(bark);
				Thread.sleep(6000);
				barkreco.recognize(bark3);
				Thread.sleep(6000);
				remote = new Remote(dogdoor);
				remote.pressButton(true); // ������ ���� ���� Ȯ���ϰ� ��ư�� ����
				break;
				
			default:
				run = false;
			}
		}

	}

}