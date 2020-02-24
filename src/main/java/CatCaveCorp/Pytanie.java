package InnyKurs.Lekcja1.Zadanie4;

import java.util.Scanner;

public class Pytanie<T> {

    private String pytanie;
    private T odpowiedzPoprawna;

    public Pytanie(String pytanie, T odpowiedzPoprawna){
        this.pytanie = pytanie;
        this.odpowiedzPoprawna = odpowiedzPoprawna;
    }

    public String getPytanie() {
        return pytanie;
    }

    public T getOdpowiedzPoprawna() {
        return odpowiedzPoprawna;
    }

    public void zadajPytanie(Gracz gracz){
        System.out.println(this.getPytanie());


        Scanner scanner = new Scanner(System.in);
        Integer odpowiedzGracza = scanner.nextInt();

        if (odpowiedzGracza.equals(getOdpowiedzPoprawna())){
            System.out.println("Poprawna odpowiedz zdobywasz 10pkt");
            gracz.setPunkty(gracz.getPunkty()+10);
        } else {
            System.out.println("Zla odpowiedz, Poprawna odpowiedz to "+ this.getOdpowiedzPoprawna());
        }

    }


}
