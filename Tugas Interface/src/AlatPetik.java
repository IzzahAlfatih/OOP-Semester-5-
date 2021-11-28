public class AlatPetik implements MusikApp{
    String urutPetik = "kosong";
    AlatPetik(String urutPetik){
        this.urutPetik = urutPetik;
    }

    @Override
    public void mainkan() {
        System.out.println("========================================================");
        System.out.println("Memainkan Alat Musik Petik:");
    }

    @Override
    public void stelNada() {
        System.out.println("Menyetel Nada Alat Petik:");
    }

    @Override
    public String ambilNama() {
        System.out.println("========================================================");
        System.out.println("Alat Musik Petik:");
        return this.urutPetik + ": ";
    }
}
