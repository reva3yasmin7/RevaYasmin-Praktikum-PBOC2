//Nama File: Titik.java\
//Deskripsi file: membuat fungsi-fungsi yang digunakan untuk membuat variabel dengan class Titik
//Nama: Reva Yasmin Naufalia
//NIM: 24060122130075
//Lab Praktikum: Kelas C2
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
