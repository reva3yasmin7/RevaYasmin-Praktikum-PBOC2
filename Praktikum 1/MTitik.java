//Nama File: MTitik.java\
//Deskripsi file: Menjalankan fungsi yang dibuat pada Titik.java dengan beberapa variabel yang memiliki class Titik
//Nama: Reva Yasmin Naufalia
//NIM: 24060122130075
//Lab Praktikum: Kelas C2
//Tanggal Praktikum: 20 februari 2024
class MTitik
{
	public static void main(String[] args)
	{
		Titik t1, t2,t3;
		t1 = new Titik(); t1.setAbsis(1);t1.setOrdinat(2);
		t2 = new Titik(); t2.setAbsis(3);t2.setOrdinat(4);
		t3 = new Titik(); t3.setAbsis(5);t3.setOrdinat(6);
		System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());
		System.out.println("t1" +"(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		System.out.println("t2" +"(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
		System.out.println("t3" +"(" + t3.getAbsis() + "," + t3.getOrdinat() + ")");
	}
}
