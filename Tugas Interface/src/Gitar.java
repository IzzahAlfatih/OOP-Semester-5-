/*
Muhammad Izzah Alfatih
1101190056
TT-43-02
 */
import java.util.Scanner;

public class Gitar extends AlatPetik{
    String namaIns;
    String nada;


    Gitar(String urutPetik, String namaIns) {
        super(urutPetik);
        this.namaIns = namaIns;
        this.nada=nada;
   }

    @Override
    public void stelNada() {
        super.stelNada();
        Scanner NP = new Scanner(System.in);
        System.out.println("Masukkan Nada Gitar:");
        nada=NP.nextLine();
    }

    @Override
    public void mainkan() {
        super.mainkan();
        System.out.println("Memainkan Gitar pada Nada "+nada);
    }

    @Override
    public String ambilNama() {
        return super.ambilNama()+this.namaIns+" (Jenis: Gitar)"+"\n"+"Nada: "+this.nada;
    }
}
