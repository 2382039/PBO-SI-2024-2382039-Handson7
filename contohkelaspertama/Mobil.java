package contohkelaspertama;

public class Mobil {

    String warna;
    String merek;
    int kecepatanMaks;

    public Mobil(final String warna, final String merek, final int kecepatanMaks) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilkanInfo() {
        System.out.println("Warna : "+ warna);
        System.out.println("Merek : "+ merek);
        System.out.println("KecepatanMaks : "+ kecepatanMaks);
    }

    public void berjalan() {
        System.out.println("Mobil" + merek + "Sedang Berjalan"); // Added space before "Sedang"
    }

    public void berhenti() {
        System.out.println("Mobil" + merek + "Sedang Berhenti"); // Corrected "Berheti" to "Berhenti" and added space
    }
}
