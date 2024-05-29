/*Nama : Reva yasmin Naufalia
  Tanggal : 29 Mei 2024
  Praktikum ke : 11 (Lambda)
  File DiskonLambda.java
  Deskripsi: ekspresi Lambda dasar, digunakan untuk menghitung diskon
 */
interface IDiskon{
    public double hitungDiskon(int harga);
}
public class DiskonLambda {
    public static void main(String[] args) {
        //pendefinisian parameter tanpa menggunakan block statement
        IDiskon diskonMerdeka=new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga*0.3);
            }
        };
        //pendefinisian parameter menggunakan block statement
        IDiskon diskonLebaran=harga -> harga - (harga*0.4);

        IDiskon diskonBiasa= harga -> {
            return harga - (harga*0.1);
        };
        System.out.println("Diskon Merdeka : "+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran : "+diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa : "+diskonBiasa.hitungDiskon(45000));
    }
}
//perbedaaan implementasi diskonMerdeka, diskonlebaran dan diskonBiasa
//ada 2 metode utk implementasi lambda, yaitu dengan block statement dan tanpa block statement

//pada diskonMerdeka, lambda diekspresikan tanpa menggunakan operator '->', dan menggunakan anonymous class
//diskonLebaran dan disskonBiasa menggunakan anonymous function untuk implementasi lambda nya
//Pada diskonLebaran, lambda diekspresikan hanya menggunakan operator '->' tanpa menggunakan kurung kurawal '{}'
//Pada diskonBiasa, lambda diekspresikan dengan operator '->' dan menggunakan kurung kurawal '{}'
