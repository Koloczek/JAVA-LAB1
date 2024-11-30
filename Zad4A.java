/* 4. a) Proszę zmodyfikować program tak by zamiast klasy Scanner wykorzystywał klasę Console.*/

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class Zad4A {
    public static void main(String[] args) {
        Map<String, String> userDatabase = new HashMap<>();
        userDatabase.put("admin", "admin123");
        userDatabase.put("user1", "password1");
        userDatabase.put("guest", "guest123");

        Console console = System.console();

        String login = console.readLine("Podaj login:");
        char[] passwordArray = console.readPassword("Podaj hasło:");
        String password = new String(passwordArray);

        if (userDatabase.containsKey(login)){
            if (userDatabase.get(login).equals(password)){
                System.out.println("Logowanie udane!");
            }
        }else {
            System.out.println("Niepoprawny login lub hasło!");
        }
    }
}
