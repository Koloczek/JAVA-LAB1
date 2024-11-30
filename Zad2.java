/* 2. Proszę napisać program, który na wejściu przyjmować będzie liczbę stopni Celsjusza, a na wyjściu zwróci liczbę stopni Fahrenheita.*/

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args){
        Scanner Temp = new Scanner(System.in);
        System.out.println("Podaj temperaturę w °C: ");
        double Celcjusz = Temp.nextDouble();

        double Fahrenheit = 32 + (9.0 / 5.0) * Celcjusz;

        System.out.println("Temperatura w stopniach Fahrenheita: " + Fahrenheit + " °F");
    }
}
