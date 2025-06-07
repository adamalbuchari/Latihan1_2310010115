package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika adam = new Matematika(1,5);
        
        System.out.println("Hasil penjumlahan: " + adam.setPenjumlahan());
        System.out.println("Hasil pengurangan: " + adam.setPengurangan());
        System.out.println("Hasil perkalian: " + adam.setPerkalian());
        System.out.println("Hasil pembagian: " + adam.setPembagian());
    }
}
