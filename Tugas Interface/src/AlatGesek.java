/*
Muhammad Izzah Alfatih
1101190056
TT-43-02
 */
public class AlatGesek implements MusikApp{
    String urutGesek = "kosong";
    AlatGesek(String urutGesek){
        this.urutGesek = urutGesek;
    }

    @Override
    public void mainkan() {
        System.out.println("========================================================");
        System.out.println("Memainkan Alat Musik Gesek:");
    }

    @Override
    public void stelNada() {
        System.out.println("Menyetel Nada Alat Gesek:");
    }

    @Override
    public String ambilNama() {
        System.out.println("========================================================");
        System.out.println("Alat Musik Gesek:");
        return this.urutGesek + ": ";
    }
}

