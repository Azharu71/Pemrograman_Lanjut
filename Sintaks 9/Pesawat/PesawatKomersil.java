public class PesawatKomersil extends Pesawat {
    /* Constructor tanpa parameter yang memanggil constructor tanpa parameter super classnya */
    public PesawatKomersil() {
        super();  // Calls the default constructor of the parent class Pesawat
    }

    /* Constructor yang memanggil constructor dengan parameter super classnya */
    public PesawatKomersil(String jenis, String nama) {
        super(jenis, nama);  // Calls the parameterized constructor of the parent class Pesawat
    }

    public static void main(String[] args) {
        // Create an instance using the default constructor
        PesawatKomersil pesawatku = new PesawatKomersil();
        
        // Create an instance using the parameterized constructor
        PesawatKomersil pesawatmu = new PesawatKomersil("BOEING", "GARUDA AIRLINES");
        
        System.out.println("PESAWATKU");
        pesawatku.infoPesawat();  // Call the inherited method to display airplane info
        System.out.println("PESAWATMU");
        pesawatmu.infoPesawat();  // Call the inherited method to display airplane info
    }
}