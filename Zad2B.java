/* 2. b) Proszę dodać do tego stopnie w skali Kelvina i możliwość wyboru skali początkowej i docelowej.
c) Proszę zmodyfikować program tak, aby wyniki podawany był z dokładnością do dwóch miejsc po przecinku.*/

import java.util.Scanner;

public class Zad2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Konwerter temperatur ===");
        System.out.println("Wybierz skalę początkową:");
        System.out.println("1. Celsius (°C)");
        System.out.println("2. Fahrenheit (°F)");
        System.out.println("3. Kelvin (K)");
        System.out.print("Twój wybór: ");
        int skalaPoczatkowa = scanner.nextInt();

        System.out.println("Podaj wartość temperatury: ");
        double temp = scanner.nextDouble();

        System.out.println("Wybierz skalę docelową:");
        System.out.println("1. Celsius (°C)");
        System.out.println("2. Fahrenheit (°F)");
        System.out.println("3. Kelvin (K)");
        System.out.print("Twój wybór: ");
        int skalaDocelowa = scanner.nextInt();

        double wynik = 0.0;

        if (skalaPoczatkowa == 1){ //Celciusz
            if (skalaDocelowa == 2){
                wynik = 32 + ((9.0 / 5.0)  * temp);
            } else if (skalaDocelowa == 3) {
                wynik = temp + 273.15;
            }else {
                wynik = temp;
            }
        } else if (skalaPoczatkowa == 2){ //Fahrenheit
            if (skalaDocelowa == 1){
                wynik = (5.0 / 9.0) * (temp - 32);
            } else if (skalaDocelowa == 3) {
                wynik = (5.0 / 9.0) * (temp - 32) + 273.15;
            }else {
                wynik = temp;
            }
        } else if (skalaPoczatkowa == 3) { //Kelvin
            if (skalaDocelowa == 1) {
                wynik = temp - 273.15;
            } else if (skalaDocelowa == 2) {
                wynik = 32 + (9.0 / 5.0) * (temp - 273.15);
            } else {
                wynik = temp;
            }
        }

        String zWynik = String.format("%.2f", wynik);
        System.out.println("Przeliczona temperatura: " + zWynik);

        scanner.close();
    }

}
