// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 2;
    public static void main(String[] args) {
      Car Ferrari = new Car("SF90");
      Car Lamborghini = new Car("Sian SKP37");
      Car Koenigsegg = new Car("Jesko");

      Thread thread1 = new Thread(Ferrari);
      Thread thread2 = new Thread(Lamborghini);
      Thread thread3 = new Thread(Koenigsegg);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
        }
    }
