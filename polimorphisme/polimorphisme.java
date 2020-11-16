import java.util.Scanner;
class polimorphisme{
	String nama;
	String alamat;
	int tipe;
	int blok;
	int blokA;
	int bayar;
	int kembalian;
	int hargabayar;
	
	Scanner input = new Scanner(System.in);
	void hasil(){
		System.out.print("Masukkan Nama = ");
		nama = input.nextLine();
		System.out.print("Masukkan Alamat = ");
		alamat = input.nextLine();
		System.out.println("TIPE");
		System.out.println("1. Tipe 36");
		System.out.println("2. Tipe 37");
	}
}