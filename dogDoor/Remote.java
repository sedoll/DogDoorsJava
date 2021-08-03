package dogDoor;
public class Remote { //리모컨

  private DogDoor door; //필드

  public Remote(DogDoor door) { //생성자
    this.door = door;
  }

  public void pressButton() { //버튼을 눌렀을 때
    System.out.println("Pressing the remote control button...");
    if (door.isOpen()) {
      door.close();
    } else {
      door.open();
    }
  }
}
