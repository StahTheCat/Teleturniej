package InnyKurs.Lekcja1.Zadanie4;

public class ZestawPytań {

    private static Pytanie jeden = new PytanieABC("Pytanie:(odp 1,2 lub 3) Pilka nozna(10pkt): W sezonie 2018/19 Lige Mistrzow wygral zespol:",
            "Liverpool","Tottenham","Real Madryt");
    private static Pytanie dwa = new PytanieABC("Pytanie:(odp 1,2 lub 3) Pilka nozna(10pkt): W sezonie 2018/19 Mistrzem Polski zostal zespol:",
            "Piast Gliwice" , "Lech Poznan", "Legia Warszawa");
    private static Pytanie trzy = new Pytanie("Pytanie: Matematyka(10pkt): 2+2*2= ", 6 );

    public ZestawPytań(){
        var jeden = ZestawPytań.jeden;
        var dwa = ZestawPytań.dwa;
        var trzy = ZestawPytań.trzy;
    }

    public  Pytanie getJeden() {
        return jeden;
    }

    public  Pytanie getDwa() {
        return dwa;
    }

    public  Pytanie getTrzy() {
        return trzy;
    }
}
