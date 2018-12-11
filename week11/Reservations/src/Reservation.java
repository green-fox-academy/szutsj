public class Reservation implements Reservationy {
  private String dayOfBooking;
  private String bookingCode;

  public Reservation() {
    dayOfBooking = getDowBooking();
    bookingCode = getCodeBooking();
  }


  @Override
  public String getDowBooking() {
    String[] daysOfTheWeek = {"MON", "TUE", "WEN", "THU", "FRI", "SAT", "SUN"};
    return daysOfTheWeek[(int)(Math.random() * 7)];
  }

  @Override
  public String getCodeBooking() {
    String generatedCode = "";
    for (int i = 0; i < 8; i++) {
      generatedCode += (char)randomNumberInRange();
    }
    return generatedCode;
  }

  public int randomNumberInRange(){
    int number;
    if (Math.random() * 10 < 8){
      number = (int)(Math.random() * (91 - 65) + 65);
    }
    else {
      number = (int)(Math.random() * (58 - 48) + 48);
    }
    return number;
  }

  @Override
  public String toString() {
    return String.format("Booking# %s for %s", bookingCode, dayOfBooking);
  }
}
