import java.util.Scanner;
class BlokkB extends polimorphisme{
	void hasilll(){
		boolean loop = true;
		
		Scanner input = new Scanner(System.in);
		System.out.println("BLOK");
		System.out.println("1. Blok A : Rp. 800.000");
		System.out.println("2. Blok B : Rp. 600.000");
		System.out.print("Blok yang dipilih = ");
		blok = input.nextInt();
		switch(blok){
			case 1 :	System.out.print("Bayar = ");
						bayar = input.nextInt();
						kembalian = bayar - 800000;
						System.out.println();
						hargabayar = 800000;
					loop = false;
					break;
			
			case 2 :	System.out.print("Bayar = ");
						bayar = input.nextInt();
						kembalian = bayar - 600000;
						System.out.println();
						hargabayar = 600000;
					loop = false;
					break;
			default:System.out.println("Blok yang anda masukkan salah. Silahkan masukkan blok dengan benar!");
		}
	}
}