public class Main {
  public static void main(String[] args) {
    Feeder f1 = new Feeder(500);
    f1.simulateOneDay(12);
    System.out.println(f1.getCurrentFood());
    // won't have a specific outcome due to Math.random()
  }
}
