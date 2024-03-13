package org.main;
import org.bangundatar.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga=new Segitiga(10,6,3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
    }
}
