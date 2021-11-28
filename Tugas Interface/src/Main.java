public class Main {
    public static void main(String[] args){
        System.out.println("===============MusikApp===============");
        //Stel Nada Gitar
        Gitar g1 = new Gitar("Instrumen 1", "Gitar1");
        g1.stelNada();

        System.out.println("========================================================");
        //Stel Nada Biola
        Biola b1 = new Biola("Instrumen 1", "Biola1");
        b1.stelNada();

        System.out.println("===============List Alat Musik===============");
        //Menampilkan alat musik petik (gitar)
        System.out.println(g1.ambilNama());
        //Menampilkan alat musik gesek (biola)
        System.out.println(b1.ambilNama());
        //Memainkan Gitar
        g1.mainkan();
        //Memainkan Biola
        b1.mainkan();


    }
}
