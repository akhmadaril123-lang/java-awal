class mobil {
    String color;
    int tahunProduksi;
}

public class MobilBeraksi{
    public static void main(String[]args ){


//  membuat objek
        mobil mobilku = new mobil();
        //  memanggil atribut dan memberi nilai
        mobilku.color = "Hitam";
        mobilku.tahunProduksi=2006;
        System.out.print("warna:"+ mobilku.color);
        System.out.print("Tahun:"+mobilku.tahunProduksi);
    }
}