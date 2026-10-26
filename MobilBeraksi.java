class mobil {
    String color;
    int tahunProduksi;
}

// public class MobilBeraksi {
//     public static void main(String[]args){
//     mobil mobilku = new mobil();
//     mobilku.color = "Hitam";
//     mobilku.tahunProduksi = 2025;

//     System.out.println(" mobil saya berwarna " + mobilku.color + " mobilku keluar pada tahun " + mobilku.tahunProduksi);
    



    
//     }
// }
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