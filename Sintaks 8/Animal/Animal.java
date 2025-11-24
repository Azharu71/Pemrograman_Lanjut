public class Animal {
    // Attribute
    String nama;
    int umur;
    String jenishidup;

    // Setter methods
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setUmur(int umur){
        this.umur = umur;
    }

    public void setJenisHidup(String jenishidup){
        this.jenishidup = jenishidup;
    }

    // Main method
    public static void main(String[] args){
        Animal jerapa = new Animal();
        Animal kijang = new Animal();
        Animal gajah = new Animal();
        Animal burung = new Animal();
    }
}