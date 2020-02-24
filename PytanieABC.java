package InnyKurs.Lekcja1.Zadanie4;

import java.util.*;

public class PytanieABC extends Pytanie {

    private String odpowiedzZla1;
    private String odpowiedzZla2;

    public PytanieABC(String pytanie, Object odpowiedzPoprawna, String odpowiedzZla1, String odpowiedzZla2) {
        super(pytanie, odpowiedzPoprawna);

        this.odpowiedzZla1 = odpowiedzZla1;
        this.odpowiedzZla2 = odpowiedzZla2;

    }

    public void zadajPytanie(Gracz gracz){
        System.out.println(this.getPytanie());

        int x = drukujOdpowiedzi();

        Scanner scanner = new Scanner(System.in);
        int odpowiedzGracza = scanner.nextInt();

        if (odpowiedzGracza ==  x){
            System.out.println("Poprawna odpowiedz zdobywasz 10pkt");
            gracz.setPunkty(gracz.getPunkty()+10);
        } else {
            System.out.println("Zla odpowiedz, Poprawna odpowiedz to "+ this.getOdpowiedzPoprawna());
        }

    }

    public int drukujOdpowiedzi(){
        //metoda losowo drukuje 3 odpowiedzi i zwracaca indeks poprawnej

        List<String> listaOdpowiedzi = new ArrayList<>();
        listaOdpowiedzi.add((String) this.getOdpowiedzPoprawna());
        listaOdpowiedzi.add(this.odpowiedzZla1);
        listaOdpowiedzi.add(this.odpowiedzZla2);

        Collections.shuffle(listaOdpowiedzi);

        int indeksPoprawnej = -1;

        for (int i = 0; i < listaOdpowiedzi.size(); i++) {
            System.out.println(i+1 +": "+listaOdpowiedzi.get(i));
            if (listaOdpowiedzi.get(i).equals(this.getOdpowiedzPoprawna())){
                indeksPoprawnej = i+1;
            }
        }
        return indeksPoprawnej;
    }


}
