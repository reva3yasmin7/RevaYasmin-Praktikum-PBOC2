/**
 * File      : MTitik.java		21-02-2024
 * Nama penulis   : Reva Yasmin Naufalia
 * NIM               : 24060122130075
 * Deskripsi : Kelas yang berisi main  dari Titik
 * 
 */
class MTitik
{
	public static void main(String[] args)
	{
		Titik p1, p2;
		p1 = new Titik(); p1.setAbsis(1);p1.setOrdinat(2);
		p2 = new Titik(); p2.setAbsis(3);p1.setOrdinat(4);
		System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());
		System.out.println("t1" +"(" + p1.getAbsis() + "," + p1.getOrdinat() + ")");
		System.out.println("t2" +"(" + p2.getAbsis() + "," + p2.getOrdinat() + ")");
		
	}
}
