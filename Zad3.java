/*3. Proszę napisać program, który jako argument będzie przyjmować datę w formacie "YYYY-MM-DD" a na wyjściu wyświetlać nazwę miesiąca oraz liczbę dni w miesiącu. Proszę skorzystać z instrukcji warunkowych.
a) Proszę zmodyfikować program tak, aby robił to samo, ale z wykorzystaniem wyrażenia switch.
b) Jeżeli podczas tworzenia kodu nie zostały uwzględnione lata przestępne, to proszę zmodyfikować program tak, aby były uwzględniane.*/

import java.time.DateTimeException;
import java.time.LocalDate;

public class Zad3 {
    public static void main(String[] args){
        if (args.length > 0){
            String dateInput = args[0];
            processDate(dateInput);
        }else {
            System.out.println("Wprowadz poprawną datę w formacie 'YYYY-MM-DD'");
        }
    }

    public static void processDate(String dateString){
        try{
            LocalDate date = LocalDate.parse(dateString);
            int year = date.getYear();
            int month = date.getMonthValue();

            String monthName;
            int daysInMonth;

            switch (month){
                case 1:
                    monthName = "Styczeń";
                    daysInMonth = 31;
                    break;
                case 2:
                    monthName = "Luty";
                    daysInMonth = (przestepny(year)) ? 29 : 28;
                    break;
                case 3:
                    monthName = "Marzec";
                    daysInMonth = 31;
                    break;
                case 4:
                    monthName = "Kwiecień";
                    daysInMonth = 30;
                    break;
                case 5:
                    monthName = "Maj";
                    daysInMonth = 31;
                    break;
                case 6:
                    monthName = "Czerwiec";
                    daysInMonth = 30;
                    break;
                case 7:
                    monthName = "Lipiec";
                    daysInMonth = 31;
                    break;
                case 8:
                    monthName = "Sierpień";
                    daysInMonth = 31;
                    break;
                case 9:
                    monthName = "Wrzesień";
                    daysInMonth = 30;
                    break;
                case 10:
                    monthName = "Październik";
                    daysInMonth = 31;
                    break;
                case 11:
                    monthName = "Listopad";
                    daysInMonth = 30;
                    break;
                case 12:
                    monthName = "Grudzień";
                    daysInMonth = 31;
                    break;
                default:
                    throw new IllegalArgumentException("Niepoprawny miesiąc: " + month);

            }
           System.out.println("Miesiąc: " + monthName + ", ilość dni: " + daysInMonth);

        }catch (DateTimeException e){
            System.out.println("Niepoprawny format daty!");
        }
    }
    public static boolean przestepny(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

