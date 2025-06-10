package latihan3;
// nama  : Adam Al Buchari
// NPM   : 2310010115
// kelas : 4A

public class Rumus {
    private int sisi;
    private int panjang;
    private int lebar;
    private int hasil;

    //Konstruktor
    public Rumus() {
        this.sisi = 0;
        this.panjang = 0;
        this.lebar = 0;
        this.hasil = 0;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLebar() {
        return lebar;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }
    //Method Accessor
    public int getHasil() {
        return hasil;
    }

    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
    }

    public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
    }

    public void tampilkanHasil() {
        System.out.println("Hasil: " + hasil);
    }
     
    public void prosesLuasPersegi() {
        hitungLuasPersegi();
        System.out.println("Luas Persegi:");
        tampilkanHasil();
    }

    public void prosesLuasPersegiPanjang() {
        hitungLuasPersegiPanjang();
        System.out.println("Luas Persegi Panjang:");
        tampilkanHasil();
    }
}