import java.util.Scanner;
class BlokkA extends polimorphisme{
	void hasill() {
		boolean loop = true;
		
		Scanner input = new Scanner(System.in);
		System.out.println("BLOK");
		System.out.println("1. Blok A : Rp. 500.000");
		System.out.println("2. Blok B : Rp. 300.000");
		System.out.print("Blok yang dipilih = ");
		blok = input.nextInt();
		switch(blok){
			case 1 :	System.out.print("Bayar = ");
						bayar = input.nextInt();
						kembalian = bayar - 500000;
						System.out.println();
						hargabayar = 500000;
					loop = false;
					break;
			
			case 2 :	System.out.print("Bayar = ");
						bayar = input.nextInt();
						kembalian = bayar - 300000;
						System.out.println();
						hargabayar = 300000;
					loop = false;
					break;
			default:System.out.println("Blok yang anda masukkan salah. Silahkan masukkan blok dengan benar!");
		}
	}
} 