package InnyKurs.Lekcja1.Zadanie4;

import java.util.Scanner;

//Prosty teleturniej. Program ma zadać użytkownikowi 3 pytania. Użytkownik może odpowiedzieć 1, 2 lub 3.
// I za każdą odpowiedź poprawną zdobywa 10 punktów. Na koniec program wyświetla ilość zdobytych punktów.

public class ProstyTeleturniej {

    public static void main(String[] args) {

        System.out.println("Witamy w grze!!");

        Gracz wojtek = new Gracz();
        ZestawPytań zs = new ZestawPytań();

        zs.getJeden().zadajPytanie(wojtek);
        zs.getDwa().zadajPytanie(wojtek);
        zs.getTrzy().zadajPytanie(wojtek);

        System.out.println("Dziękujemy za grę!");
        System.out.println("Twoja liczba punktów to +" + wojtek.getPunkty());


    }
}
