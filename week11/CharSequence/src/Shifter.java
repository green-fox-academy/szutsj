public class Shifter implements CharSequence{
  private String string;
  private int numberOfShifts;

  public Shifter(String string, int numberOfShifts){
    this.string = "";
    this.numberOfShifts = numberOfShifts;

    for (int i = numberOfShifts; i < string.length(); i++) {
      this.string += string.charAt(i);
    }

    for (int i = 0; i < numberOfShifts; i++) {
      this.string += string.charAt(i);
    }
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return string.substring(start, end);
  }
}
