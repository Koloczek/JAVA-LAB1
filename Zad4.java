/* 4. Proszę napisać program, który po uruchomieniu będzie pytać się o login i hasło użytkownika, a następnie pokazywać wiadomość czy próba logowania się udała.
Jako bazę użytkowników można wykorzystać Mapę a do wczytywania danych klasę Scanner. */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Map<String, String> userDatabase = new HashMap<>();
        userDatabase.put("admin", "admin123");
        userDatabase.put("user1", "password1");
        userDatabase.put("guest", "guest123");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj login:");
        String login = scanner.nextLine();

        System.out.println("Podaj hasło:");
        String password = scanner.nextLine();

        if (userDatabase.containsKey(login)){
            if (userDatabase.get(login).equals(password)){
                System.out.println("Logowanie udane!");
            }
        }else {
            System.out.println("Niepoprawny login lub hasło!");
        }
        scanner.close();
    }
}
