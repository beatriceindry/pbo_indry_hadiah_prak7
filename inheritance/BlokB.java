import java.util.Scanner;
class BlokB extends BlokA{
	void hasill(){
		boolean loop = true;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Tipe yang dipilih = ");
		tipe = input.nextInt();
		while(loop){
			switch(tipe){
				case 1:	System.out.println("BLOK");
						System.out.println("1. Blok A : Rp. 500.000");
						System.out.println("2. Blok B : Rp. 300.000");
						System.out.println("Blok yang dipilih = ");
						blok = input.nextInt();
						switch(blok){
							case 1 :	System.out.print("Bayar = ");
										bayar = input.nextInt();
										kembalian = bayar - 500000;
										System.out.println();
										hargabayar = 500000;
									loop= false;
									break;
									
							case 2 :	System.out.print("Bayar = ");
										bayar = input.nextInt();
										kembalian = bayar - 300000;
										System.out.println();
										hargabayar = 300000;
									loop = false;
									break;
							default:System.out.println("Blok yang Anda masukkan salah! Silahkan masukkan blok dengan bayar");
						}
						loop = false;
						break;
						
				case 2: System.out.println("BLOK");
						System.out.println("1. Blok A : Rp. 800.000");
						System.out.println("2. Blok B : Rp. 600.000");
						System.out.print("Blok yang dipilih = ");
						blokA = input.nextInt();
						switch(blokA){
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
							default:System.out.println("Blok yang anda masukkan salah! Silahkan masukkan blok dengan benar");
						}
						loop = false;
						break;
						
				default: System.out.println("Tipe yang anda masukkan salah. Silahkan masukkan tipe dengan benar!");
			}
			break;
		}
	}
}