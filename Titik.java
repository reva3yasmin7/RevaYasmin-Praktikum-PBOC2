/**
 * File      : Titik.java		21-02-2024
 * Nama penulis   : Reva Yasmin Naufalia
 * NIM               : 24060122130075
 * Deskripsi : Kelas yang berisi main method dari Titik
 * 
 */
class Titik
{
	double absis, ordinat;
	static double counterTitik;
	
	Titik()
	{	absis=0;
		ordinat=0;
		counterTitik++;}
	void setAbsis(double aa)
	{	absis=aa;	}

	void setOrdinat(double oo)
	{	ordinat=oo;	}

	double getAbsis()
	{	return absis;	}
	double getOrdinat()
	{	return ordinat;	}
	static double getCounterTitik()
	{	return counterTitik;}

}
