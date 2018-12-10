public class Gnirts implements CharSequence {
  private String string;

  public Gnirts(String string){
    this.string = string;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(string.length() - 1 - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String stringToWorkWith = "";

    for (int i = string.length() - 1; i >= 0;  i--) {
      stringToWorkWith += string.charAt(i);
      }
    return stringToWorkWith.substring(start, end);
  }
}
