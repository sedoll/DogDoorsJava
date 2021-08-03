package dogDoor;
public class Bark {

  private String sound; //필드

  public Bark(String sound) { //생성자
    this.sound = sound;
  }

  public String getSound() {
    return sound;
  }

  public boolean equals(Object bark) {
    if (bark instanceof Bark) {
      Bark otherBark = (Bark)bark;
      if (this.sound.equalsIgnoreCase(otherBark.sound)) { //소리가 같을 때, true
        return true; 
      }
    }
    return false; //소리가 다를 때 false
  }
}