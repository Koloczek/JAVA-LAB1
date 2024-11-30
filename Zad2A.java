/* 2. a) Proszę zmodyfikować program tak, aby można było wybierać pomiędzy konwersją Celsjusz -> Fahrenheit a Fahrenheit -> Celsjusz.*/

import java.util.Scanner;

public class Zad2A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {

            System.out.println("========= Menu =========");
            System.out.println("1. Konwersja z °C na °F,");
            System.out.println("2. Konwersja z °F na °C,");
            System.out.println("3. Wyjście");
            System.out.print("Wybierz opcję: ");

            String wybor = scanner.nextLine();

            switch (wybor) {
                case "1":
                    System.out.println("======== Opcja 1 ========");

                    Scanner TempC = new Scanner(System.in);
                    System.out.println("Podaj temperaturę w °C: ");
                    double Celcjusz1 = TempC.nextDouble();

                    double Fahrenheit1 = 32 + (9.0 / 5.0) * Celcjusz1;

                    String zFH1 = String.format("%.2f", Fahrenheit1);

                    System.out.println("Temperatura w stopniach Fahrenheita: " + zFH1 + " °F");

                    break;
                case "2":
                    System.out.println("======== Opcja 2 ========");
                    Scanner TempF = new Scanner(System.in);
                    System.out.println("Podaj temperaturę w °F: ");
                    double Fahrenheit2 = TempF.nextDouble();

                    double Celcjusz2 = (5.0 / 9.0) * (Fahrenheit2 - 32);

                    String zC2 = String.format("%.2f", Celcjusz2);

                    System.out.println("Temperatura w stopniach Fahrenheita: " + zC2 + " °C");

                    break;
                case "3":
                    System.out.println("Koniec programu.");
                    running = false;
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }

            System.out.println();
        }

        scanner.close();
    }
}

