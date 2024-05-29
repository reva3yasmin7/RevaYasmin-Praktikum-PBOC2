/*Nama : Reva yasmin Naufalia
  Tanggal : 29 Mei 2024
  Praktikum ke : 11 (Lambda)
  File LatihanLambda.java
  Deskripsi: Implementasi Lambda pada map, digunakan sebagai parameter
            pada method.
 */
import java.util.HashMap;
import java.util.Map;

public class LatihanLambda {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(30075,"Reva Yasmin Naufalia");
        map.put(20029,"Maulida Aprilia Cinta Ariyatin");

        map.forEach((nim,nama)-> {
            System.out.print(nim+" ");
            System.out.println(nama);
        });
    }
}