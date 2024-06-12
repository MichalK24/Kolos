import java.util.Scanner;
//Napisz program który przelicza prędkość z m/s na km/h.
//-program powienin wczytać prędkość w m/s 
//-przeliczyć ją na km/h
//-wyświetl wyniki
public class Main
  {
  public static void main(String[] args) 
  {
     Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj wartość prędkości w m/s:");
    double predkosc1 = scanner.nextDouble();
    double predkosc2 = predkosc1 * 3.6;
    System.out.println("Prędkość wynosi: " + predkosc2+ "km/h");
    scanner.close();
    
  }


}