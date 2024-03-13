package org.main;
import org.bangundatar.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi=new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("luas Persegi Panjang : "+persegi.hitungLuas());
    }
}