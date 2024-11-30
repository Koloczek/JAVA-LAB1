/*1. Proszę napisać, skompilować i uruchomić za pomocą linii poleceń swój pierwszy program Witaj Świecie, który będzie na ekranie wyświetlał ten właśnie napis.
Proszę zmodyfikować program tak by zamiast Witaj Świecie program wyświetlał Witaj ${twojeImie} gdzie ${twojeImie} podawane jest jako argument wiersza poleceń. */

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args){
        if (args.length > 0){
            String twojeImie = args[0];
            System.out.println("Witaj Świecie");
            System.out.println("Witaj " + twojeImie);
        }
    }
}
