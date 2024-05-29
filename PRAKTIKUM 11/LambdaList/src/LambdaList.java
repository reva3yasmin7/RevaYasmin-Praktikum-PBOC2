/*Nama : Reva yasmin Naufalia
  Tanggal : 29 Mei 2024
  Praktikum ke : 11 (Lambda)
  File LambdaList.java
  Deskripsi: Implementasi Lambda pada list, digunakan sebagai parameter
            pada method.
 */
import java.util.ArrayList;
public class LambdaList {
    public static void main(String[] args) {
       // System.out.println("i = " + i);
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        mahasiswaList.forEach((nama)-> System.out.println(nama));
    }
}