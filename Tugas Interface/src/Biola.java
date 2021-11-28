import java.util.Scanner;

public class Biola extends AlatGesek{
    String namaIns = "Biola";
    String nada;


    Biola(String urutGesek, String namaIns) {
        super(urutGesek);
        this.namaIns = namaIns;
        this.nada=nada;
    }

    @Override
    public void stelNada() {
        super.stelNada();
        Scanner NG = new Scanner(System.in);
        System.out.println("Masukkan Nada Biola:");
        nada=NG.nextLine();
    }

    @Override
    public void mainkan() {
        super.mainkan();
        System.out.println("Memainkan Biola pada Nada "+nada);
    }

    @Override
    public String ambilNama() {
        return super.ambilNama()+this.namaIns+" (Gitar)"+"\n"+"Nada: "+this.nada;
    }
}

